package test.dagger.maker;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;

public class CoffeeMaker {
    @Inject
    @Named("Good")
    Lazy<Heater> heater; // Don't want to create a possibly costly heater until we need it.
    @Inject
    Pump pump;

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}
