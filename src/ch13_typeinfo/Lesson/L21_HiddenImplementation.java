package ch13_typeinfo.Lesson;

import ch13_typeinfo.Lesson.L20_interface.A;
import ch13_typeinfo.Lesson.L21_packageaccess.HiddenC;

import java.lang.reflect.Method;

/**
 * Created by jienanzhang on 08/04/2017.
 */

// Sneaking around package access.

public class L21_HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C';
        /*if (a instanceof C) {
            C c = (C)a;
            c.g();
        }*/
        // Oops! Reflection still allows us to call g();
        callHiddenMethod(a, "g");
        // And even methods that are less accessible!
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}


// That's how to use reflection to call hidden method