package hw1.labSwitch;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private int age;
    private int drivingExperience;
    private boolean hasChronicDiseases;
    private double discount;

    public double getDiscountPercent() {
        return 1 - discount * 0.01;
    }
}
