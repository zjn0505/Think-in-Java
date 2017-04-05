package ch13_typeinfo.Exercise.E16_coffee2;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Breve extends Coffee {
    public static class Factory implements typeinfo.factory.Factory<Breve> {
        public Breve create() { return new Breve(); }
    }
}
