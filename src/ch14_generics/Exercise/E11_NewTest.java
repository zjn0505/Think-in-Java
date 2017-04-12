package ch14_generics.Exercise;

/**
 * Created by Jienan on 2017/4/12.
 */

import net.mindview.util.New;

import java.util.List;
import java.util.Set;

/****************** Exercise 11 *****************
 * Test New.java by creating your own classes and
 * ensuring that New will work properly with them.
 ************************************************/
public class E11_NewTest {
    public static void main(String[] args) {
        List<SixTuple<Byte, Short, String, Float, Double, Integer>> list = New.list();
        list.add(
            new SixTuple<Byte, Short, String, Float, Double, Integer>(
                (byte)1, (short)1, "A", 1.0F, 1.0, 1));
        System.out.println(list);
        Set<Sequence<String>> set = New.set();
        set.add(new Sequence<String>(5));
        System.out.println(set);
    }
}
