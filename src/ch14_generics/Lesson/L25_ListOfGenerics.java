package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 05/05/2017.
 */
public class L25_ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
}
