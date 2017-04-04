package ch13_typeinfo.Exercise.E11_pets;

import ch13_typeinfo.Lesson.L11_pets.Pet;
import ch13_typeinfo.Lesson.L11_pets.PetCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 04/04/2017.
 */
@SuppressWarnings("unchecked")
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "ch13_typeinfo.Lesson.L11_pets.Mutt",
            "ch13_typeinfo.Lesson.L11_pets.Pug",
            "ch13_typeinfo.Lesson.L11_pets.EgyptianMau",
            "ch13_typeinfo.Lesson.L11_pets.Manx",
            "ch13_typeinfo.Lesson.L11_pets.Cymric",
            "ch13_typeinfo.Lesson.L11_pets.Rat",
            "ch13_typeinfo.Lesson.L11_pets.Mouse",
            "ch13_typeinfo.Lesson.L11_pets.Hamster",
            "ch13_typeinfo.Exercise.E11_pets.Gerbill"
    };

    static {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
