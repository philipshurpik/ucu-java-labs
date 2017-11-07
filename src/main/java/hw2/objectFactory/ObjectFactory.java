package hw2.objectFactory;

import hw2.objectFactory.annotations.AnnotationConfigurator;
import hw2.objectFactory.annotations.AnnotationsConfig;
import hw2.objectFactory.config.Config;
import hw2.objectFactory.config.JavaConfig;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private AnnotationsConfig annotationsConfig = new AnnotationsConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() { }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
           type =  config.getImpl(type);
        }
        T instance = type.newInstance();

        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation.toString());

                Annotation fieldAnnotation = field.getAnnotation(annotation.annotationType());
                if (fieldAnnotation != null) {
                    AnnotationConfigurator configurator = annotationsConfig.getConfigurator(fieldAnnotation.annotationType());
                    configurator.configure(instance, field, fieldAnnotation);
                }
            }
        }
        return instance;
    }
}
