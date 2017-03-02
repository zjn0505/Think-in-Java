package ch10_holding.Lesson;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jienan on 2017/2/27.
 */
// Producing an alphabetic listing.
// Pass in Comparator to TreeSet constructor

public class L19_UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("src\\ch10_holding\\Lesson\\L17_SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
