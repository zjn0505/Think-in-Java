package ch13_typeinfo.Exercise.E15_pets2;

import ch13_typeinfo.Lesson.L11_pets.Rodent;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Rat extends Rodent {
    public static class Factory implements typeinfo.factory.Factory<Rat> {
        public Rat create() {
            return new Rat();
        }
    }
}
