package ch14_generics.Lesson;


import ch14_generics.Lesson.L05_coffee.Coffee;
import ch14_generics.Lesson.L05_coffee.CoffeeGenerator;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jienan on 2017/4/12.
 */
// A utility to use with Generators
public class L10_Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee)
            System.out.println(c);
        Collection<Integer> fnumbers = fill(new ArrayList<Integer>(), new L06_Fibonacci(), 12);
        for (int i : fnumbers)
            System.out.print(i + " ");
    }
}
