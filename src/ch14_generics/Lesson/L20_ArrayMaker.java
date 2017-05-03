package ch14_generics.Lesson;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by jienanzhang on 03/05/2017.
 */
public class L20_ArrayMaker<T> {
    private Class<T> kind;
    public L20_ArrayMaker(Class<T> kind) { this.kind = kind; }
    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        L20_ArrayMaker<String> stringMaker =
            new L20_ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Array.newInstance("s".getClass(), 9));
    }
}

// kind is stored without any param as Class.
