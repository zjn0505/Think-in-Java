package ch08_interfaces.Lesson;

import ch07_polymorphism.Lesson.L10_CovarianReturn;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jienan on 2016/10/20.
 */
public class L09_RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();
    private int count;
    public L09_RandomWords(int count) { this.count = count; }
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1; // Indicates end of input
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new L09_RandomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
