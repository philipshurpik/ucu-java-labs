package hw2.objectFactory.config;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
