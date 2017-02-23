package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/23.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/****************** Exercise 5 ******************
 * Use Integers instead of Pets to modify
 * ListFeatures.java (remember autoboxing).
 * Explain any difference in results.
 ***********************************************/
public class E05_IntegerListFeatures {
    static Random rand = new Random(47);

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7)
        );
        System.out.println("1: " + ints);
        ints.add(8);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(8));
        ints.remove(Integer.valueOf(8));
        Integer i = ints.get(2);
        System.out.println("4: " + i + " "+ ints.indexOf(i));
        Integer j = Integer.valueOf(1);
        System.out.println("5: " + ints.indexOf(j));
        System.out.println("6: " + ints.remove(j));
        System.out.println("7: " + ints.remove(i));
        System.out.println("8: " + ints);
        ints.add(3, 0);
        System.out.println("9: " + ints);
    }
}
