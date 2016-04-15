package ch04_Initialization.Exercise;

/**
 * Created by Jienan on 2016/4/15.
 * Write a method that takes a vararg String
 * array. Verify that you can pass either a
 * comma-separated list of Strings of a
 * String[] into this method.
 */
public class E19_VarargStringArray {
    static void printStrings(String... args) {
        for (String s : args)
            System.out.println(s);
    }

    public static void main(String[] args) {
        printStrings("There", "are", "some", "strings");
        printStrings(
                new String[] {"There", "are", "some", "strings"}
        );
    }

}
