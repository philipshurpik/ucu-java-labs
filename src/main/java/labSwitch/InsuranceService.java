package labSwitch;

import labSwitch.calculator.Insurance;
import labSwitch.calculator.SwitchInsuranceCalculator;

import java.util.Random;

public class InsuranceService {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int key = random.nextInt(InsuranceType.values().length);
        InsuranceType insuranceType = InsuranceType.values()[key];
        Person person = new Person.PersonBuilder().age(18).discount(5).drivingExperience(0).build();
        double insuranceAmount = random.nextInt(100000) + 2000;

        Insurance switchCalculator = new SwitchInsuranceCalculator();

        showPrice(switchCalculator, insuranceType, person, insuranceAmount);
    }

    private static void showPrice(Insurance calculator, InsuranceType insuranceType, Person person, double insuranceAmount) {
        try {
            double percentRate = calculator.getPercentRate(insuranceType, person);
            double excessAmount = calculator.getExcessAmount(insuranceType, insuranceAmount);
            StringBuilder priceString = new StringBuilder();
            priceString.append("Insurance Type: ").append(insuranceType)
                    .append(" Insurance Amount: ").append(insuranceAmount)
                    .append(" Percent Rate: ").append(percentRate)
                    .append(" Excess Amount: ").append(excessAmount)
                    .append(" Price: ").append(insuranceAmount * percentRate * 0.01);
            System.out.println(priceString);
        }
        catch (Exception e) {
            System.out.println("Show price error" + e);
        }
    }
}
