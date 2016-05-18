package test.dagger.maker;

import dagger.Module;
import dagger.Provides;
import test.dagger.CoffeeApp;

import javax.inject.Named;
import javax.inject.Singleton;

@Module(
//        injects = {
//                CoffeeApp.class,
//                ElectricHeater.class
//        },
        includes = PumpModule.class
)
public class DripCoffeeModule {
    @Provides
    @Singleton
    @Named("Good")
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
