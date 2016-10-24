package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */

import ch08_interfaces.Exercise.E05_ownpackage.AnInterface;

/****************** Exercise 5 ******************
 * Create an interface with three methods in its
 * own package. Implement the interface in a
 * different package.
 ***********************************************/

class ImplementInterface implements AnInterface {

    @Override
    public void f() {
        System.out.println("ImplementInterface.f");
    }

    @Override
    public void g() {
        System.out.println("ImplementInterface.g");
    }

    @Override
    public void h() {
        System.out.println("ImplememntInterface.h");
    }
}

public class E05_ImplementInterface {
    public static void main(String[] args) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();
    }
}
