package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/3/1.
 */

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/****************** Exercise 25 *****************
 * Create a Map<String,ArrayList<Integer>>. Use
 * net.mindview.TextFile to open a text file and
 * read it in a word at a time (use "\\W+" as the
 * second argument to the TextFile constructor).
 * Count the words as you read them in, and for each
 * word in the file, record in the ArrayList<Integer>
 * the word count associated with that word - this is,
 * in effect, the location in the file where that
 * word was found.
 ***********************************************/
public class E25_WordsInfo3 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> stat =
                new HashMap<String, ArrayList<Integer>>();
        int wordCount = 0;
        for(String word :
                new TextFile("src\\ch10_holding\\Exercise\\E25_WordsInfo3.java", "\\W+")) {
            ArrayList<Integer> loc = stat.get(word);
            if(loc == null) {
                loc = new ArrayList<Integer>();
                stat.put(word, loc);
            }
            loc.add(++wordCount);
        }
        System.out.println(stat);
    }
}
