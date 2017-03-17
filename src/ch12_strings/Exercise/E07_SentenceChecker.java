package ch12_strings.Exercise;

/**
 * Created by jienanzhang on 17/03/2017.
 */
/****************** Exercise 7 ******************
 * Using the documentation for java.util.regex.Pattern
 * as a resource, write and test a regular expression
 * that checks a sentence to see that it begins with a
 * capital letter and ends with a period.
 ************************************************/
public class E07_SentenceChecker {
    public static boolean matches(String text) {
        return text.matches("\\p{javaUpperCase}.*\\.");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
