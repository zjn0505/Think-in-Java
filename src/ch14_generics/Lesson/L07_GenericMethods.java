package ch14_generics.Lesson;

/**
 * Created by Jienan on 2017/4/12.
 */
public class L07_GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        L07_GenericMethods gm = new L07_GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}

// The first <T> indicates this method as a generics method
