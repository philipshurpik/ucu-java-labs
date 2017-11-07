package hw2.objectFactory;

import hw2.objectFactory.config.Config;
import hw2.objectFactory.config.JavaConfig;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Random;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private Random random = new Random();

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
                    configureAnnotation(instance, field, (InjectRandomInt) fieldAnnotation);
                }
            }
        }
        return instance;
    }

    @SneakyThrows
    private void configureAnnotation(Object instance, Field field, InjectRandomInt annotation) {
        int min = annotation.min();
        int max = annotation.max();
        int randomIntValue = random.nextInt(max - min) + min;
        field.setAccessible(true);
        field.set(instance, randomIntValue);
    }
}
