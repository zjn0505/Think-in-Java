package ch13_typeinfo.Exercise.E11_pets;

import ch13_typeinfo.Lesson.L11_pets.Rodent;

/**
 * Created by jienanzhang on 04/04/2017.
 */
/****************** Exercise 11 *****************
 * Add Gerbil to the typeinfo.pets library and
 * modify all the examples in this chapter to adapt
 * to this new class.
 ***********************************************/
public class Gerbil extends Rodent{
    public Gerbil(String name) {
        super(name);
    }
    public Gerbil() {}
}
