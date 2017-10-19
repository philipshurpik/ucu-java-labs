package labSwitch.insurance;

import labSwitch.InsuranceType;
import labSwitch.Person;

public class HomeInsurance implements Insurance {
    public double getPercentRate(InsuranceType insuranceType, Person person) throws Exception {
        return 1.4 - person.getAge() * 0.005;
    }

    public double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception  {
        return 1000;
    }
}
