package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 05/05/2017.
 */
public class L27_GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public L27_GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) {
        return array[index];
    }
    // Methods that exposes the underlying representation:
    public T[] rep() { return array; }

    public static void main(String[] args) {
        L27_GenericArray<Integer> gai =
            new L27_GenericArray<Integer>(10);
        // This causes a ClassCastException:
        //! Integer[] ia = gai.rep();
        // This is OK:
        Object[] oa = gai.rep();
    }
}
