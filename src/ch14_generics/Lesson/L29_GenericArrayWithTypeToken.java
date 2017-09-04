package ch14_generics.Lesson;

import java.lang.reflect.Array;

/**
 * Created by jienanzhang on 06/05/2017.
 **/
public class L29_GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public L29_GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    // Expose the underlying representation:
    public T[] rep() { return array; }

    public static void main(String[] args) {
        L29_GenericArrayWithTypeToken<Integer> gai =
            new L29_GenericArrayWithTypeToken<Integer>(
                Integer.class, 10
            );
        // This now works:
        Integer[] ia = gai.rep();
    }
}
