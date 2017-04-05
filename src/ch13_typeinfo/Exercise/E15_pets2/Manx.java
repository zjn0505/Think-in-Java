package ch13_typeinfo.Exercise.E15_pets2;

import ch13_typeinfo.Lesson.L11_pets.Cat;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Manx extends Cat {
    public static class Factory implements typeinfo.factory.Factory<Manx> {
        public Manx create() {
            return new Manx();
        }
    }
}
