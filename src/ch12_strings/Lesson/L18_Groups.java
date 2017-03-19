package ch12_strings.Lesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jienanzhang on 19/03/2017.
 */
public class L18_Groups {
    static public final String POEM =
        "Twas brilling, and the slithy toves\n" +
        "Did gyre and gimble in the wabe.\n" +
        "All mimsy were the borogoves.\n" +
        "And the mome raths outgrabe.\n\n" +
        "Beware the Jabberwock, my son.\n" +
        "The jaws that bite, the claws that catch.\n" +
        "Beware the Jubjub bird, and shun\n" +
        "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                .matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++)
                System.out.print("[" + m.group(j) + "]");
            System.out.println();
        }
    }
}

/**
 *  (?m) multiline mode
 *  $ end of line
 *
 *  Find and print into group last three words in line
 */