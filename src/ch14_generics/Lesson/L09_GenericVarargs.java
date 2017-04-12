package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jienan on 2017/4/12.
 */
public class L09_GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args)
            result.add(item);
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMOPQRSTUVWXYZ".split(""));
        System.out.println(ls);
    }
}
