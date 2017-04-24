package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/24.
 */

import ch14_generics.Lesson.L11_CountedObject;
import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/****************** Exercise 14 *****************
 * Modify BasicGeneratorDemo.java to use the
 * explicit form of creation for the Generator
 * (that is, use the explicit constructor instead
 * of the generic create() method).
 ************************************************/
public class E14_BasicGeneratorDemo2 {
    public static void main(String[] args) {
        Generator<L11_CountedObject> gen =
            new BasicGenerator<L11_CountedObject>(L11_CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
