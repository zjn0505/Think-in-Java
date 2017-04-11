package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/11.
 */

import ch14_generics.Lesson.L06_Fibonacci;

import java.util.Iterator;

/****************** Exercise 7 *****************
 * Use composition instead of inheritance to adapt
 * Fibonacci to make it Iterable.
 ************************************************/
class IterableFibonacci implements Iterable<Integer> {
    private L06_Fibonacci fib = new L06_Fibonacci();
    private int n;
    public IterableFibonacci(int count) { n = count; }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                --n;
                return fib.next();
            }
        };
    }
}


public class E07_IterableFibonacci2 {
    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }

}
