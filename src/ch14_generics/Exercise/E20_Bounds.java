package ch14_generics.Exercise;

/**
 * Created by jienanzhang on 01/05/2017.
 */
/****************** Exercise 20 *****************
 * Create an interface with two methods, and a class
 * that implements that interface and adds another
 * method. In another class, create a generic method
 * with an argument type that is bounded by the
 * interface, and show that the methods in the
 * interface are callable inside this generic method.
 * In main(), pass an instance of the implementing
 * class to the generic method.
 ************************************************/

interface Top {
    void a();
    void b();
}

class CombinedImpl implements Top {
    public void a() {
        System.out.println("Top::a()");
    }
    public void b() {
        System.out.println("Top::b()");
    }
    public void c() {
        System.out.println("CombinedImpl::c()");
    }
}

public class E20_Bounds {
    static <T extends Top> void f(T obj) {
        obj.a();
        obj.b();
        //! obj.c(); c() is not part of the interface
    }

    public static void main(String[] args) {
        f(new CombinedImpl());
    }
}
