package ch13_typeinfo.Lesson.L11_pets;

/**
 * Created by jienanzhang on 03/04/2017.
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.creatArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        System.out.println();
        System.out.println(counter);
    }
}
