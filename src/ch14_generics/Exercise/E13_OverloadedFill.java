package ch14_generics.Exercise;

/**
 * Created by jienanzhang on 23/04/2017.
 */

import ch14_generics.Lesson.L05_coffee.Coffee;
import ch14_generics.Lesson.L05_coffee.CoffeeGenerator;
import ch14_generics.Lesson.L06_Fibonacci;
import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

import java.util.*;

/****************** Exercise 13 *****************
 * Overload the fill() method so the arguments
 * and return types are the specific subtypes of
 * Collection: List, Queue and Set. This way, you
 * don't lose the type of container. Can you overload
 * to distinguish between List and LinkedList?
 ************************************************/
public class E13_OverloadedFill {

    public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            list.add(gen.next());
        return list;
    }

    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            queue.add(gen.next());
        return queue;
    }

    public static <T> LinkedList<T> fill(LinkedList<T> llist, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            llist.add(gen.next());
        return llist;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            set.add(gen.next());
        return set;
    }

    public static void main(String[] args) {
        List<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
        for (Coffee c : coffee)
            System.out.println(c);

        Queue<Integer> iQueue = fill((Queue<Integer>) new LinkedList<Integer>(), new L06_Fibonacci(), 12);
        for (int i : iQueue)
            System.out.print(i + " ");

        System.out.println();

        LinkedList<Character> cLList = fill(new LinkedList<Character>(), new CountingGenerator.Character(), 12);
        for (char ch : cLList)
            System.out.print(ch);

        System.out.println();

        Set<Boolean> bSet = fill(new HashSet<Boolean>(), new CountingGenerator.Boolean(), 10);
        for (Boolean b : bSet)
            System.out.println(b);
    }

}
