package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 01/05/2017.
 */
public class L18_ReturnGenericType<T extends L18_HasF> {
    private T obj;
    public L18_ReturnGenericType(T x) { obj = x; }
    public T get() { return obj; }
}

// Generic help here for return class to be generic and in certain type.