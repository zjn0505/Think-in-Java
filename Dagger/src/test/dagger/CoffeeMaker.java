package test.dagger;

import dagger.Lazy;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

class CoffeeMaker {
  @Inject @Named("Good")Lazy<Heater> heater; // Don't want to create a possibly costly heater until we need it.
  @Inject Pump pump;
  @Inject @Named("Good") Heater h;
//  @Inject Cup cup;
    @Inject
    Provider<Cup> mCupProvider;

  public void brew() {
    heater.get().on();
    pump.pump();
    System.out.println(" [_]P coffee! [_]P ");
    heater.get().off();
      h.on();
      mCupProvider.get().fillTheCup();
  }
}
