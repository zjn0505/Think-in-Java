package test.dagger.server;

import dagger.Module;
import dagger.Provides;
import test.dagger.CoffeeApp;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by Jienan on 2016/5/17.
 */
@Module(
        injects = {
                CoffeeApp.class,
                GiantMug.class
        },
        complete = false, library = true
)
public class UtilsModule {

    @Provides
    @Singleton
    Cup provideCup(GiantMug mug) {
        return mug;
    }

    @Provides
    @Named("Expensive")
    Coaster provideExpensiveCoaster(FancyTable table) {
        return new StarbuckFancyMat(table);
    }

    @Provides
    @Named("Cheap")
    Coaster provideCheepCoaster(FancyTable table) {
        return new McDonaldFancyMat(table);
    }
}
