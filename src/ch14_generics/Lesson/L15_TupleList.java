package ch14_generics.Lesson;

import net.mindview.util.FourTuple;

import java.util.ArrayList;

/**
 * Created by jienanzhang on 29/04/2017.
 */
// Combining generic types to make complex generic types

public class L15_TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
    public static void main(String[] args) {
        L15_TupleList<Vehicle, Amphibian, String, Integer> tl =
            new L15_TupleList<Vehicle, Amphibian, String, Integer>();
        tl.add(L02_TupleTest.h());
        tl.add(L02_TupleTest.h());
        for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl)
            System.out.println(i);
    }
}
