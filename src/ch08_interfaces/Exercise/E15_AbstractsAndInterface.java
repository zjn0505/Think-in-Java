package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/20.
 */
/****************** Exercise 15 ******************
 * Modify Exercise 14 by creating an abstract class
 * and inheriting it into the derived class.
 ***********************************************/
abstract class Abstract {
    String s;
    public Abstract(String s) { this.s = s; }
    abstract void af();
}

class All2 extends Abstract implements Multiple {

    All2 () { super("All2"); }
    @Override
    void af() {

    }

    @Override
    public void h() {

    }

    @Override
    public void f1() {

    }

    @Override
    public void g1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void g2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void g3() {

    }
}

public class E15_AbstractsAndInterface {
    static void takes1(Interface1 i) {
        i.f1();
        i.g1();
    }
    static void takes2(Interface2 i) {
        i.f2();
        i.g2();
    }
    static void takes3(Interface3 i) {
        i.f3();
        i.g3();
    }
    static void takesAll(All2 a) {
        a.f1();
        a.f2();
        a.f3();
        a.g1();
        a.g2();
        a.g3();
        a.h();
    }

    static void takesAbstract(Abstract a) {
        a.af();
    }

    public static void main(String[] args) {
        All2 a = new All2();
        takes1(a);
        takes2(a);
        takes3(a);
        takesAll(a);
        takesAbstract(a);
    }
}
