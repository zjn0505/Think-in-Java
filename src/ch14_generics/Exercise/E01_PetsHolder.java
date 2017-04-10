package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/10.
 */

import ch13_typeinfo.Lesson.L11_pets.Mouse;
import ch13_typeinfo.Lesson.L11_pets.Pet;
import ch14_generics.Lesson.L01_Holder3;

/****************** Exercise 1 *****************
 * Use Holder3 with the typeinfo.pets library to
 * show that a Holder3 that is specified to hold
 * a base type can also hold a derived type.
 ************************************************/
public class E01_PetsHolder {
    public static void main(String[] args) {
        L01_Holder3<Pet> h3 = new L01_Holder3<Pet>(new Mouse("Mickey"));
        System.out.println(h3.get());
    }
}
