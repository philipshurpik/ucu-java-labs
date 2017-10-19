package labSwitch.insurance;

import labSwitch.InsuranceType;
import labSwitch.Person;

public class CarInsurance implements Insurance {
    public double getPercentRate(InsuranceType insuranceType, Person person) throws Exception {
        return (10 - person.getAge() * 0.05 - person.getDrivingExperience() * 0.15) * person.getDiscountPercent();
    }

    public double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception {
        return 500 + insuranceAmount * 0.01;
    }
}
