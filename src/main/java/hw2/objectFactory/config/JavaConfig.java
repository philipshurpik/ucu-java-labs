package hw2.objectFactory.config;

import hw2.objectFactory.cleaner.Cleaner;
import hw2.objectFactory.cleaner.CleanerImpl;
import hw2.objectFactory.speaker.ConsoleSpeaker;
import hw2.objectFactory.speaker.Speaker;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {

    private Map<Class, Class> map = new HashMap<>();

    public JavaConfig() {
        map.put(Speaker.class, ConsoleSpeaker.class);
        map.put(Cleaner.class, CleanerImpl.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> ifc) {
        return map.get(ifc);
    }
}
