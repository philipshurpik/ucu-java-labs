package hw2.objectFactory.speaker;

public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
