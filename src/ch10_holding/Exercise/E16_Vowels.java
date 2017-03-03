package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/27.
 */

import net.mindview.util.TextFile;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/****************** Exercise 16 *****************
 * Create a Set of the vowels. Working from
 * UniqueWords.java, count and display the number of
 * vowels in each input word, and also display the
 * total number of vowels in the input file.
 ***********************************************/
public class E16_Vowels {
    private final static Set<Character> vowels =
            new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u',
                    'A', 'E', 'I', 'O', 'U'));

    public static void main(String[] args) {
        HashSet<String> processedWord = new HashSet<String>();
        int fileVowels = 0;
        int wordVowels;
        for (String word : new TextFile("src\\ch10_holding\\Exercise\\E16_Vowels.java", "\\W+")) {
            wordVowels = 0;
            for (char letter : word.toCharArray())
                if(vowels.contains(letter))
                    wordVowels++;
            if (!processedWord.contains(word)) {
                processedWord.add(word);
                System.out.println(word + " has " + wordVowels + " vowel(s)");
            }
            fileVowels += wordVowels;
        }
        System.out.println("Total number of vowels in file: " + fileVowels);
    }
}
