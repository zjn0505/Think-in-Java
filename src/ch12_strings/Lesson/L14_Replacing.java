package ch12_strings.Lesson;

/**
 * Created by jienanzhang on 17/03/2017.
 */
public class L14_Replacing {
    static String s = L13_Splitting.knights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }

}

















