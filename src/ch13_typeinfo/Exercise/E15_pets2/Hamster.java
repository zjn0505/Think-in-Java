package ch13_typeinfo.Exercise.E15_pets2;

import ch13_typeinfo.Lesson.L11_pets.Rodent;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Hamster extends Rodent {
    public static class Factory implements typeinfo.factory.Factory<Hamster> {
        public Hamster create() {
            return new Hamster();
        }
    }
}
