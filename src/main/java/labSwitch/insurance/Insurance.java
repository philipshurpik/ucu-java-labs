package labSwitch.insurance;

import labSwitch.InsuranceType;
import labSwitch.Person;

public interface Insurance {
    double getPercentRate(InsuranceType insuranceType, Person person) throws Exception;
    double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception;
}
