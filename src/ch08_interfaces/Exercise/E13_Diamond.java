package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/19.
 */

/****************** Exercise 13 ******************
 * Create an interface, inherit two new
 * interfaces from it, then multiply-inherit
 * a third interface from the second two.
 ***********************************************/

interface BaseInterface {
    void f();
}

interface IntermediateInterface1 extends BaseInterface {
    void f();
}

interface IntermediateInterface2 extends BaseInterface {
    void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void f();
}

class CombinedImpl implements CombinedInterface {
    public void f() {
        System.out.println("CombinedImpl.f()");
    }
}

public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f();
    }
}
