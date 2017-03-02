package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/28.
 */

import net.mindview.util.TextFile;

import java.util.*;

/****************** Exercise 21 *****************
 * Using a Map<String,Integer>, follow the form of
 * UniqueWords.java to create a program that counts
 * the occurrence of words in a file. Sort the
 * results using Collections.sort() with a second
 * argument of String.CASE_INSENSITIVE_ORDER (to
 * produce an alphabetic sort), and display the result.
 ***********************************************/
public class E21_WordsInfo {
    public static void main(String[] args) {
        Map<String, Integer> wordStat =
                new HashMap<String, Integer>();
        for (String word : new TextFile("src\\ch10_holding\\Exercis\\E21_WordsInfo.java", "\\W+")) {
            Integer freq = wordStat.get(word);
            wordStat.put(word, freq == null ? 1 : freq + 1);
        }
        List<String> keys =
                new ArrayList<String>(wordStat.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (String key : keys)
            System.out.println(key + " => " + wordStat.get(key));
    }
}
