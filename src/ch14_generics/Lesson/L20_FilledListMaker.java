package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 03/05/2017.
 */
public class L20_FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for(int i = 0; i < n; i++)
            result.add(t);
        return result;
    }

    public static void main(String[] args) {
        L20_FilledListMaker<String> stringMaker =
            new L20_FilledListMaker<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
}
