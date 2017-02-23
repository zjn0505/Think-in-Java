package ch10_holding.Lesson;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Jienan on 2017/2/23.
 */
public class L04_SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
