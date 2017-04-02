package ch13_typeinfo.Lesson.L11_pets;

import java.util.ArrayList;

/**
 * Created by jienanzhang on 02/04/2017.
 */
// Facade to produce a default PetCreator
public class Pets {
    public static final PetCreator creator =
        new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] creatArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}
