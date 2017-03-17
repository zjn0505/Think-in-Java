package ch12_strings.Exercise;

import ch12_strings.Lesson.L13_Splitting;

/**
 * Created by jienanzhang on 17/03/2017.
 */
public class E09_Replacing2 {
    public static void main(String[] args) {
        System.out.println(L13_Splitting.knights.replaceAll(
            "(?i)[aeiou]", "_"
        ));
    }
}
