package labSwitch.insurance;

import labSwitch.InsuranceType;
import labSwitch.Person;

public class SwitchInsuranceCalculator implements Insurance {

    public double getPercentRate(InsuranceType insuranceType, Person person) throws Exception {
        switch (insuranceType) {
            case CAR_INSURANCE:
                return (10 - person.getAge() * 0.05 - person.getDrivingExperience() * 0.15) * person.getDiscountPercent();
            case HOME_INSURANCE:
                return 1.4 - person.getAge() * 0.005;
            case LIFE_INSURANCE:
                return 4 + person.getAge() * 0.005 + (person.isHasChronicDiseases() ? 2 : 0);
            default:
                throw new Exception("Invalid Insurance type");
        }
    }

    public double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception  {
        switch (insuranceType) {
            case CAR_INSURANCE:
                return 500 + insuranceAmount * 0.01;
            case HOME_INSURANCE:
                return 1000;
            case LIFE_INSURANCE:
                return 500;
            default:
                throw new Exception("Invalid Insurance type");
        }
    }

}
