package ch10_holding.Lesson;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Jienan on 2017/2/27.
 */
public class L18_UniqueWords {
    public static void main(String[] args) {
        // TODO need import TextFile lib
        Set<String> words = new TreeSet<String>(
//                new TextFile("SetOperations.java", "\\W+");
        );
        System.out.println(words);
    }
}
