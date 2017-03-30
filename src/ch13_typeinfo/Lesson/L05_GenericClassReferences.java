package ch13_typeinfo.Lesson;

/**
 * Created by Jienan on 2017/3/30.
 */
public class L05_GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
}
