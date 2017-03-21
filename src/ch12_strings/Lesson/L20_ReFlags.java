package ch12_strings.Lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jienan on 2017/3/21.
 */
public class L20_ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
            Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
            "java has regex\nJava has regex\n" +
            "JAVA has pretty good regular expressions\n" +
            "Regular expressions are in Java");
        while (m.find())
            System.out.println(m.group());
    }
}
