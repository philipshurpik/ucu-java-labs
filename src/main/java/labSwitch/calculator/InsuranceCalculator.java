package labSwitch.calculator;

import labSwitch.InsuranceType;
import labSwitch.Person;

public interface InsuranceCalculator {
    double getInsurancePercentRate(InsuranceType insuranceType, Person person) throws Exception;
    double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception;
}
