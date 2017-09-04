package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 03/05/2017.
 */
public class L20_ListMaker<T> {
    List<T> create() { return new ArrayList<T>(); }

    public static void main(String[] args) {
        L20_ListMaker<String> stringMaker = new L20_ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
}
