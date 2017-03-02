package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/28.
 */

import net.mindview.util.TextFile;

import java.util.*;

/****************** Exercise 22 *****************
 * Modify the previous exercise so that it uses a
 * class containing a String and a count field to
 * store each different word, and a Set of these
 * objects to maintain the list of words.
 ***********************************************/

class WordCounter {
    public static final Comparator<WordCounter> CASE_INSENSITIVE_ORDER =
            new Comparator<WordCounter>() {
                @Override
                public int compare(WordCounter o1, WordCounter o2) {
                    return o1.word.compareToIgnoreCase(o2.word);
                }
            };
    private final String word;
    private int frequency;
    WordCounter(String word) {
        this.word = word;
        frequency = 1;
    }

    void incFrequency() { ++frequency; }
    String getWord() {
        return word;
    }
    int getFrequency() { return frequency; }

    @Override
    public boolean equals(Object o) {
        return o instanceof WordCounter &&
                word.equals(((WordCounter)o).word);
    }

    // Override hashCode() so contains() works.
    @Override
    public int hashCode() { return word.hashCode(); }
}

public class E22_WordsInfo2 {
    static void updateStat(Iterator<WordCounter> it, WordCounter wc) {
        while (it.hasNext()) {
            WordCounter currentWC = it.next();
            if (currentWC.equals(wc)) {
                currentWC.incFrequency();
            }
        }
    }

    public static void main(String[] args) {
        Set<WordCounter> stat = new HashSet<WordCounter>();
        for(String word :
                new TextFile("src\\ch10_holding\\Exercise\\E22_WordsInfo2.java", "\\W+")) {
            WordCounter wc = new WordCounter(word);
            if(stat.contains(wc))
                updateStat(stat.iterator(), wc);
            else
                stat.add(wc);
        }
        List<WordCounter> l = new ArrayList<WordCounter>(stat);
        Collections.sort(l, WordCounter.CASE_INSENSITIVE_ORDER);
        for (WordCounter wc : l)
            System.out.println(wc.getWord() + " => " + wc.getFrequency());
    }
}
