package test.dagger;

import javax.inject.Inject;

/**
 * Created by Jienan on 2016/5/17.
 */
public class GiantMug implements Cup{

    @Inject
    GiantMug(){

    }

    @Override
    public void fillTheCup() {
        System.out.println(String.format("I have a fancy cup with %d holders, it is filled with coffee.", 2));
    }
}
