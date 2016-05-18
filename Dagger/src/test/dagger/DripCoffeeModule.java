package test.dagger;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module(
    injects = {
            CoffeeApp.class,
            ElectricHeater.class
    },
    includes = PumpModule.class
)
class DripCoffeeModule {
  @Provides @Singleton @Named("Good")
  Heater provideHeater() {
    return new ElectricHeater();
  }
}
