package ch13_typeinfo.Exercise.E15_pets2;

import ch13_typeinfo.Lesson.L11_pets.Dog;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Mutt extends Dog {
    public static class Factory implements typeinfo.factory.Factory<Mutt> {
        public Mutt create() {
            return new Mutt();
        }
    }
}
