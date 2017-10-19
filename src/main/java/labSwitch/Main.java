package labSwitch;

import labSwitch.insurance.Insurance;
import labSwitch.insurance.SwitchInsuranceCalculator;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int key = random.nextInt(InsuranceType.values().length);
        InsuranceType insuranceType = InsuranceType.values()[key];
        Person person = new Person.PersonBuilder().age(18).discount(5).drivingExperience(0).build();
        double insuranceAmount = random.nextInt(100000) + 2000;

        // Switch version:
        Insurance switchCalculator = new SwitchInsuranceCalculator();
        String switchString = showPrice(switchCalculator, insuranceType, person, insuranceAmount);

        // OOP version:
        Insurance insurance = insuranceType.get();
        String oopString = showPrice(insurance, insuranceType, person, insuranceAmount);

        System.out.println("The same results: " + switchString.equals(oopString));
    }

    private static String showPrice(Insurance calculator, InsuranceType insuranceType, Person person, double insuranceAmount) {
        StringBuilder priceString = new StringBuilder();
        try {
            double percentRate = calculator.getPercentRate(insuranceType, person);
            double excessAmount = calculator.getExcessAmount(insuranceType, insuranceAmount);
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
        return priceString.toString();
    }
}
