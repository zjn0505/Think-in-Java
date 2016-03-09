package ch02_Operators;

import java.util.Random;

/**
 * Using the bitwise operators.
 * Created by Jienan on 2016/3/9.
 */
public class L06_BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos", +maxpos);


    }

    private static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ".binary:\n  " +
            Integer.toBinaryString(i));
    }
    private static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ".binary:\n  " +
            Long.toBinaryString(l));
    }


}
