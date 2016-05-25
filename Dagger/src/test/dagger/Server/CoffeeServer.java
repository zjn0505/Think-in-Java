package test.dagger.server;

import dagger.Lazy;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class CoffeeServer {
    //  @Inject Cup cup;
    @Inject
    Lazy<Cup> mLazyCup;
    @Inject
    @Named("Expensive")
    Provider<Coaster> coasterProvider;

    @Inject
    @Named("Cheap")
    Provider<Coaster> cheapCoasterProvider;

    public void prepare(int person) {
        for (int i = 1; i <= person; i++) {
            coasterProvider.get();
            mLazyCup.get().fillTheCup();
        }
    }

    public void prepareVIP(int person) {
        for (int i = 1; i <= person; i++) {
            System.out.println("A VIP is coming, prepare Big-Mac for him");
            cheapCoasterProvider.get();
            mLazyCup.get().fillTheCup();
        }

    }
}
