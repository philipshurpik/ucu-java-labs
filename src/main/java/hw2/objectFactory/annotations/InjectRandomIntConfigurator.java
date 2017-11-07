package hw2.objectFactory.annotations;

import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntConfigurator implements AnnotationConfigurator {
    private Random random = new Random();

    @SneakyThrows
    public void configure(Object instance, Field field, Annotation fieldAnnotation) {
        InjectRandomInt annotation = (InjectRandomInt)fieldAnnotation;
        int min = annotation.min();
        int max = annotation.max();
        int randomIntValue = random.nextInt(max - min) + min;
        field.setAccessible(true);
        field.set(instance, randomIntValue);
    }
}
