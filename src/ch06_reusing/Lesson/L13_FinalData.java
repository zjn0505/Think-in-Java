package ch06_reusing.Lesson;

import java.util.Random;

/**
 * Created by jienanzhang on 8/13/16.
 */

class Value {
    int i;
    public Value(int i) {this.i = i;}
}

public class L13_FinalData {
    private static Random rand = new Random();
    private String id;
    public L13_FinalData(String id) {this.id = id;}
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1,2,3,4,5,6};
    public String toString() {
        return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        L13_FinalData fd1 = new L13_FinalData("fd1");
        //! fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++)
            fd1.a[i]++;
        //! fd1.v2 = new Value(0);
        //! fd1.VAL_3 = new Value(1);
        //! fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        L13_FinalData fd2 = new L13_FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
