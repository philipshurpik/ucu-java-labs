package hw2.objectFactory.config;

import com.sun.xml.internal.txw2.IllegalAnnotationException;
import hw2.objectFactory.annotations.AnnotationConfigurator;
import hw2.objectFactory.annotations.InjectRandomInt;
import hw2.objectFactory.annotations.InjectRandomIntConfigurator;

import java.util.HashMap;
import java.util.Map;

public class JavaAnnotationsConfig implements AnnotationsConfig {

    private Map<Class, AnnotationConfigurator> map = new HashMap<>();

    public JavaAnnotationsConfig() {
        map.put(InjectRandomInt.class, new InjectRandomIntConfigurator());
    }

    public <T> AnnotationConfigurator getConfigurator(Class<T> annotationType) {
        if (!map.containsKey(annotationType)) {
            throw new IllegalAnnotationException("Annotation Config not contains this annotation" + annotationType.getSimpleName());
        }
        return map.get(annotationType);
    }
}
