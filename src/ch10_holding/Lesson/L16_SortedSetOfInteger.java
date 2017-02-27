package ch10_holding.Lesson;

import java.util.*;

/**
 * Created by Jienan on 2017/2/27.
 */
public class L16_SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> intset = new TreeSet<>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);

        intset.clear();
        for (int i = 0; i < 13; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);

    }
}
