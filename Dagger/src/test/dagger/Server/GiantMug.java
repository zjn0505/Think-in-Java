package test.dagger.server;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Jienan on 2016/5/17.
 */
@Singleton
class GiantMug implements Cup {

    @Inject
    GiantMug() {
    }

    private int i = 1;

    @Override
    public void fillTheCup() {
        System.out.println(String.format("I have a fancy cup for guest %d, it is filled with coffee.", i++));
    }
}
