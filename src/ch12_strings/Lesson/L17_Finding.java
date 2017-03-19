package ch12_strings.Lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jienanzhang on 19/03/2017.
 */
public class L17_Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Eveinging is full of the linnet's wings");
        while (m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
