package hw1.labSwitch.insurance;

import hw1.labSwitch.InsuranceType;
import hw1.labSwitch.Person;

public class CarInsurance implements Insurance {
    public double getPercentRate(InsuranceType insuranceType, Person person) throws Exception {
        return (10 - person.getAge() * 0.05 - person.getDrivingExperience() * 0.15) * person.getDiscountPercent();
    }

    public double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception {
        return 500 + insuranceAmount * 0.01;
    }
}
