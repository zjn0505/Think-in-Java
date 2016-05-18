package test.dagger.server;

/**
 * Created by Jienan on 2016/5/17.
 */
class McDonaldFancyMat implements Coaster {

    McDonaldFancyMat(Table table) {
        beThere(table);
    }

    @Override
    public void beThere(Table table) {
        System.out.println("Place a Big-Mac logo on the " + table);
    }
}
