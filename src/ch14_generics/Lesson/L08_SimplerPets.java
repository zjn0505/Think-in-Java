package ch14_generics.Lesson;

import ch13_typeinfo.Lesson.L11_pets.Person;
import ch13_typeinfo.Lesson.L11_pets.Pet;
import net.mindview.util.New;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jienan on 2017/4/12.
 */
public class L08_SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
