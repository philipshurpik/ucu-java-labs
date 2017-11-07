package hw2.objectFactory.cleaner;

import hw2.objectFactory.annotations.InjectRandomInt;

public class CleanerImpl implements Cleaner {
    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVvvvvvvvvvvvvvvvvv");
        }
    }
}
