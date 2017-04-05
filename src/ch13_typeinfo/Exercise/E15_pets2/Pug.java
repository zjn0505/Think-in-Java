package ch13_typeinfo.Exercise.E15_pets2;

import ch13_typeinfo.Lesson.L11_pets.Dog;

/**
 * Created by Jienan on 2017/4/5.
 */
public class Pug extends Dog {
    public static class Factory implements typeinfo.factory.Factory<Pug> {
        public Pug create() {
            return new Pug();
        }
    }
}
