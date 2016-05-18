package test.dagger.maker;

import javax.inject.Inject;
import javax.inject.Named;

class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    Thermosiphon(@Named("Good") Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
