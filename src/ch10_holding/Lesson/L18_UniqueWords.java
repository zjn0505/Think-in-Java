package ch10_holding.Lesson;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jienan on 2017/2/27.
 */
public class L18_UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src\\ch10_holding\\Lesson\\L17_SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
