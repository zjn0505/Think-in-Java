package ch13_typeinfo.Exercise;

/**
 * Created by jienanzhang on 08/04/2017.
 */

import ch13_typeinfo.Exercise.E25_classa.A;

import java.lang.reflect.Method;

/****************** Exercise 25 *****************
 * Create a class containing private, protected and
 * package access methods. Write code to access these
 * methods from outside of the class’s package.
 ************************************************/
public class E25_HiddenMethodCalls {
    static void callHiddenMethod(Object a, String methodName)
            throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }

    public static void main(String[] args) throws Exception {
        class B extends A {
            protected void b() { super.b(); }
        }
        A objA = new A();
        callHiddenMethod(objA, "a");
        callHiddenMethod(objA, "b");
        callHiddenMethod(objA, "c");
        B objB = new B();
        objB.b();
    }
}
