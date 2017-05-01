package ch14_generics.Lesson;

import java.util.ArrayList;

/**
 * Created by jienanzhang on 01/05/2017.
 */
public class L17_ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
