package ch13_typeinfo.Exercise.E16_coffee2;

import typeinfo.factory.Factory;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Americano extends Coffee {
    public static class Factory implements typeinfo.factory.Factory<Americano> {
        public Americano create() { return new Americano(); }
    }
}
