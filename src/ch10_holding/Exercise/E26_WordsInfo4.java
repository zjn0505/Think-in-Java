package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/3/2.
 */

import net.mindview.util.TextFile;

import java.util.*;

/****************** Exercise 26 *****************
 * Take the resulting Map from the previous
 * exercise and recreate the order of the words as
 * they appeared in the original file.
 ***********************************************/
public class E26_WordsInfo4 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat =
                new HashMap<String, ArrayList<Integer>>();
        int wordCount = 0;
        List<String> origWords =
                new TextFile("src\\ch10_holding\\Exercise\\E26_WordsInfo4.java", "\\W+");
        for (String word : origWords) {
            ArrayList<Integer> loc = stat.get(word);
            if (loc == null) {
                loc = new ArrayList<Integer>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }

        TreeMap<Integer, String> words = new TreeMap<Integer, String>();
        for (Map.Entry<String, ArrayList<Integer>> entry : stat.entrySet()) {
            for (Integer pos : entry.getValue())
                words.put(pos, entry.getKey());
        }
        System.out.println(origWords);
        System.out.println(words.values());
    }
}
