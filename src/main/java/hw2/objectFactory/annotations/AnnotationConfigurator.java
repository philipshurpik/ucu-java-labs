package hw2.objectFactory.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public interface AnnotationConfigurator {
    void configure(Object instance, Field field, Annotation fieldAnnotation);
}
