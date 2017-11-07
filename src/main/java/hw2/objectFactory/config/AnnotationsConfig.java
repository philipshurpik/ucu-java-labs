package hw2.objectFactory.config;

import hw2.objectFactory.annotations.AnnotationConfigurator;

public interface AnnotationsConfig {
    <T> AnnotationConfigurator getConfigurator(Class<T> ifc);
}