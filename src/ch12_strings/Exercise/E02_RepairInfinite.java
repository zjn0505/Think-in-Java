package ch12_strings.Exercise;

/**
 * Created by Jienan on 2017/3/16.
 */

import ch12_strings.Lesson.L06_InfiniteRecursion;

import java.util.ArrayList;
import java.util.List;

/****************** Exercise 2 ******************
 * Repair InfiniteRecursion.java.
 ************************************************/
public class E02_RepairInfinite {
    public String toString() {
        return " InfiniteRecursion address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<E02_RepairInfinite> v = new ArrayList<E02_RepairInfinite>();
        for (int i = 0; i < 10; i++)
            v.add(new E02_RepairInfinite());
        System.out.println(v);
    }
}
