package test.dagger.server;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Jienan on 2016/5/18.
 */
@Singleton
public class FancyTable implements Table{
    @Inject
    FancyTable(){
        System.out.println("Place a fancy table in the room");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
