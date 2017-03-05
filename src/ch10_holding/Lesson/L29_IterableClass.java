package ch10_holding.Lesson;

import java.util.Iterator;

/**
 * Created by jienanzhang on 05/03/2017.
 */
// ANything Iterable works with foreach

public class L29_IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how " +
            "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new L29_IterableClass())
            System.out.print(s + " ");
    }
}
