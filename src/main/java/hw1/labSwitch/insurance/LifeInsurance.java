package hw1.labSwitch.insurance;

import hw1.labSwitch.InsuranceType;
import hw1.labSwitch.Person;

public class LifeInsurance implements Insurance {
    public double getPercentRate(InsuranceType insuranceType, Person person) throws Exception {
        return 4 + person.getAge() * 0.005 + (person.isHasChronicDiseases() ? 2 : 0);
    }

    public double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception  {
        return 500;
    }
}
