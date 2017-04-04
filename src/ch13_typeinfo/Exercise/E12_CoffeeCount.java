package ch13_typeinfo.Exercise;

/**
 * Created by jienanzhang on 04/04/2017.
 */

import ch13_typeinfo.Lesson.L11_pets.TypeCounter;
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

import java.util.Iterator;

/****************** Exercise 12 *****************
 * Use TypeCounter with the CoffeeGenerator.java
 * class in the Generics chapter.
 ***********************************************/
public class E12_CoffeeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        for (Iterator<Coffee> it = new CoffeeGenerator(20).iterator(); it.hasNext();) {
            Coffee coffee = it.next();
            System.out.print(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }
        System.out.println();
        System.out.println(counter);
    }
}
