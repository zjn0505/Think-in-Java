package test.dagger;

import dagger.ObjectGraph;
import test.dagger.maker.CoffeeMaker;
import test.dagger.maker.DripCoffeeModule;
import test.dagger.server.CoffeeServer;
import test.dagger.server.UtilsModule;

import javax.inject.Inject;

public class CoffeeApp implements Runnable {
    @Inject
    CoffeeMaker coffeeMaker;
    @Inject
    CoffeeServer coffeeServer;

    @Override
    public void run() {
        coffeeMaker.brew();
        coffeeServer.prepare(2);
    }

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new DripCoffeeModule(), new UtilsModule());
        CoffeeApp coffeeApp = objectGraph.get(CoffeeApp.class);
        coffeeApp.run();
    }
}
