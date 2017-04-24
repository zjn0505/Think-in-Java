package ch14_generics.Lesson;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * Created by Jienan on 2017/4/24.
 */
public class L11_BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<L11_CountedObject> gen = BasicGenerator.create(L11_CountedObject.class);
        for (int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
