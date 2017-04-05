package ch13_typeinfo.Exercise.E16_coffee2;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Mocha extends Coffee {
    public static class Factory implements typeinfo.factory.Factory<Mocha> {
        public Mocha create() { return new Mocha(); }
    }
}
