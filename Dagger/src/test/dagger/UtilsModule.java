package test.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jienan on 2016/5/17.
 */
@Module(complete = false, library = true)
public class UtilsModule {

    @Provides
    Cup providerCup(GiantMug mug){
        return mug;
    }

    @Provides
    Coaster provideCoaster(){
        return new StarbuckFancyMat();
    }
}
