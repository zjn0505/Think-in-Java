package ch12_strings.Exercise;

/**
 * Created by jienanzhang on 17/03/2017.
 */

import ch12_strings.Lesson.L13_Splitting;

import java.util.Arrays;

/****************** Exercise 8 ******************
 * Split the string Splitting.knights on the words
 * "the" or "you."
 ************************************************/
public class E08_Splitting2 {
    public static void split(String regex) {
        System.out.println(
                Arrays.toString(L13_Splitting.knights.split(regex))
        );
    }

    public static void main(String[] args) {
        split("the|you");
    }
}
