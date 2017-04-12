package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/12.
 */

import net.mindview.util.New;

import java.util.List;
import java.util.Set;

/****************** Exercise 12 *****************
 * Repeat the previous exercise using explicit type
 * specification.
 ************************************************/
public class E12_NewTest2 {
    static void f(List<SixTuple<Byte, Short, String, Float, Double, Integer>> l) {
        l.add(new SixTuple<Byte, Short, String, Float, Double, Integer>(
                (byte)1, (short)1, "a", 1.0F, 1.0, 1));
        System.out.println(l);
    }
    static void g(Set<Sequence<String>> s) {
        s.add(new Sequence<String>(5));
        System.out.println(s);
    }

    public static void main(String[] args) {
        f(New.<SixTuple<Byte, Short, String, Float, Double, Integer>>list());
        g(New.<Sequence<String>>set());
    }
}
