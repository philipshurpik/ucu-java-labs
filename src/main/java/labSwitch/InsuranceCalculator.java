package labSwitch;

public interface InsuranceCalculator {
    double getInsurancePercentRate(InsuranceType insuranceType, Person person) throws Exception;
    double getExcessAmount(InsuranceType insuranceType, double insuranceAmount) throws Exception;
}
