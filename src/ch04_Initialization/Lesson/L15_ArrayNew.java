package ch04_Initialization.Lesson;

import java.util.Arrays;
import java.util.Random;

/**
 * Creating arrays with new.
 * Created by Jienan on 2016/3/31.
 */
public class L15_ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
