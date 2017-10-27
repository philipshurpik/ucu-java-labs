package hw1.labSwitch.insurance;

import hw1.labSwitch.InsuranceType;
import hw1.labSwitch.Person;

public interface Insurance {
    double getPercentRate(InsuranceType insuranceType, Person person) throws Exception;
    double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception;
}
