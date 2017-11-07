package hw2.objectFactory.annotations;

import java.util.HashMap;
import java.util.Map;

public class AnnotationsConfig {

    private Map<Class, AnnotationConfigurator> map = new HashMap<>();

    public AnnotationsConfig() {
        map.put(InjectRandomInt.class, new InjectRandomIntConfigurator());
    }

    public <T> AnnotationConfigurator getConfigurator(Class<T> annotationType) {
        return map.get(annotationType);
    }
}
