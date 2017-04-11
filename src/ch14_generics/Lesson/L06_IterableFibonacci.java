package ch14_generics.Lesson;

import java.util.Iterator;

/**
 * Created by Jienan on 2017/4/11.
 */
// Adapt the Fibonacci class to make it Iterable.
public class L06_IterableFibonacci extends L06_Fibonacci implements Iterable<Integer> {
    private int n;
    public L06_IterableFibonacci(int count) { n = count; }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return L06_IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new L06_IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
