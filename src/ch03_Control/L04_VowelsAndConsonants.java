package ch03_Control;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;

/**
 * Created by Jienan on 2016/3/10.
 */
public class L04_VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a Vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
