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

        int maxpos = Integer.MAX_VALUE;
        printBinaryInt("maxpos", maxpos);
        int maxneg = Integer.MIN_VALUE;
        printBinaryInt("maxneg", maxneg);

        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);

        printBinaryInt("j", j);
        printBinaryInt("i", i);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);

        printBinaryInt("i", i);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("i >>> 5", i >>> 5);

        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        System.out.println("---------------------------------------");

        long l = rand.nextInt();
        long m = rand.nextInt();
        printBinaryLong("-1", -1);
        printBinaryLong("+1", +1);

        long maxposL = Long.MAX_VALUE;
        printBinaryLong("maxpos", maxposL);
        long maxnegL = Long.MIN_VALUE;
        printBinaryLong("maxneg", maxnegL);

        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);

        printBinaryLong("m", m);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m", l | m);
        printBinaryLong("l ^ m", l ^ m);

        printBinaryLong("l", l);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("l >>> 5", l >>> 5);

        printBinaryLong("(~l) >> 5", (~l) >> 5);
        printBinaryLong("(~l) >>> 5", (~l) >>> 5);

    }

    private static void printBinaryInt(String s, int i) {
        System.out.println(String.format("%11s", s) + ", int: " + String.format("%12d",i) + ".   binary:  " +
            String.format("%32s", Integer.toBinaryString(i)));
    }
    private static void printBinaryLong(String s, long l) {
        System.out.println(String.format("%11s", s) + ", long: " + String.format("%20d",l) + ".      binary:  " +
                String.format("%64s", Long.toBinaryString(l)));
    }


}
