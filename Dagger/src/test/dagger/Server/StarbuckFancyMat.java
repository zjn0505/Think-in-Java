package test.dagger.server;

/**
 * Created by Jienan on 2016/5/17.
 */
class StarbuckFancyMat implements Coaster {

    StarbuckFancyMat(Table table) {
        beThere(table);
    }

    @Override
    public void beThere(Table table) {
        System.out.println("Place a Starbuck logo on the " + table);
    }
}
