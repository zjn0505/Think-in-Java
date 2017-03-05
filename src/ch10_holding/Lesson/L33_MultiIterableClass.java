package ch10_holding.Lesson;

import java.util.*;

/**
 * Created by jienanzhang on 05/03/2017.
 */

// Adding several Adapter Methods

public class L33_MultiIterableClass extends L29_IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<String> randomized() {
        return new Iterable<String>() {

            @Override
            public Iterator<String> iterator() {
                List<String> shuffled =
                        new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        L33_MultiIterableClass mic = new L33_MultiIterableClass();
        for (String s : mic.reversed())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic.randomized())
            System.out.print(s + " ");
        System.out.println();
        for (String s : mic)
            System.out.print(s + " ");
    }
}
