package ch04_Initialization.Lesson;

import java.util.Arrays;

/**
 * Created by Jienan on 2016/3/31.
 */
public class L17_ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3,
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3,
        };

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
