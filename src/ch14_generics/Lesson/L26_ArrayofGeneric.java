package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 05/05/2017.
 */
public class L26_ArrayofGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //! gia = (Generic<Integer>[]) new Object[SIZE]; // produce ClassCastException:
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
        //! gia[1] = new Objcet();
        //! gia[2] = new Generic<Double>();
    }
}
