package ch13_typeinfo.Lesson;

/**
 * Created by jienanzhang on 31/03/2017.
 */
public class L07_BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        //! bounded = String.class;
        bounded = Number.class;
        // Or anything else derived from Number
    }
}
