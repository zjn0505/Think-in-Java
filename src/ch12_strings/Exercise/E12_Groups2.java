package ch12_strings.Exercise;

/**
 * Created by jienanzhang on 19/03/2017.
 */

import ch12_strings.Lesson.L18_Groups;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/************************** Exercise 12 ******************
 * Modify Groups.java to count all unique words
 * with no initial capital letter.
 *********************************************************/
public class E12_Groups2 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>();
        Matcher m =
                Pattern.compile("\\b(?![A-Z])\\w+\\b")
                .matcher(L18_Groups.POEM);
        while (m.find())
            words.add(m.group());
        System.out.println("Number of unique word = " + words.size());
        System.out.println(words.toString());
    }
}

/**
 * (?!X) Match X, via zero-width negative lookahead
 * \b    Word boundary
 */
