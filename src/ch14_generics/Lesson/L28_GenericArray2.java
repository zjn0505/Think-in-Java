package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 06/05/2017.
 */
public class L28_GenericArray2<T> {
    private Object[] array;
    public L28_GenericArray2(int sz) {
        array = new Object[sz];
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    @SuppressWarnings("unchecked")
    public T get(int index) { return (T)array[index]; }
    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T[])array; // Warning: unchecked cast
    }

    public static void main(String[] args) {
        L28_GenericArray2<Integer> gai =
            new L28_GenericArray2<Integer>(10);
        for (int i = 0; i < 10; i++)
            gai.put(i, i);
        for (int i = 0; i < 10; i++)
            System.out.print(gai.get(i) + " ");
        System.out.println();
        try {
            Integer[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
        Object[] ta = gai.rep();
        System.out.println(ta[1].getClass());
    }
}
