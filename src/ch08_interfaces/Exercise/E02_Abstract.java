package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */
// {CompileTimeError}
/****************** Exercise 2 *****************
 * Create a class as abstract without including
 * any abstract methods, and verify that you
 * cannot create any instances of that class.
 ***********************************************/
abstract class NoAbstractMethods {
    void f() {
        System.out.println("f()");
    }
}

public class E02_Abstract {
    public static void main(String[] args) {
        //! new NoAbstractMethods();
    }
}
