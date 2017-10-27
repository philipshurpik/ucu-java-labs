package hw1.labSwitch;

import hw1.labSwitch.insurance.*;
import java.util.function.Supplier;

public enum InsuranceType {
    LIFE_INSURANCE(LifeInsurance::new), HOME_INSURANCE(HomeInsurance::new), CAR_INSURANCE(CarInsurance::new);

    private final Supplier<Insurance> constructor;

    InsuranceType(Supplier<Insurance> constructor) {
        this.constructor = constructor;
    }

    Insurance get() {
        return constructor.get();
    }
};