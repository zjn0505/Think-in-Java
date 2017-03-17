package ch12_strings.Lesson;

/**
 * Created by jienanzhang on 17/03/2017.
 */
public class L15_Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[] {"Rudolph",
            "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
}
