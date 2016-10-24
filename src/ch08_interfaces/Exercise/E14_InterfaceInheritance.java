package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/20.
 */
/****************** Exercise 14 ******************
 * Create three interfaces, each with two methods.
 * Inherit a new interface from each, adding
 * a new method. Use the new interface to create
 * a class, and inherit from a concrete class.
 * Now write four methods, each of which takes one
 * of the four interfaces as an argument. Create
 * an object of your class in main(), and pass it
 * to each of the methods.
 ***********************************************/

interface Interface1 {
    void f1();
    void g1();
}

interface Interface2 {
    void f2();
    void g2();
}
interface Interface3 {
    void f3();
    void g3();
}

interface Multiple extends Interface1, Interface2, Interface3 {
    void h();
}

class Concrete {
    String s;
    public Concrete(String s) { this.s = s; }
}

class All extends Concrete implements Multiple {

    All() {
        super("All");
    }
    @Override
    public void h() {
        System.out.println("All.h");
    }

    @Override
    public void f1() {
        System.out.println("All.f1");
    }

    @Override
    public void g1() {
        System.out.println("All.g1");
    }

    @Override
    public void f2() {
        System.out.println("All.f2");
    }

    @Override
    public void g2() {
        System.out.println("All.g2");
    }

    @Override
    public void f3() {
        System.out.println("All.f3");
    }

    @Override
    public void g3() {
        System.out.println("All.g3");
    }
}

public class E14_InterfaceInheritance {
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
    static void takesAll(All a) {
        a.f1();
        a.f2();
        a.f3();
        a.g1();
        a.g2();
        a.g3();
        a.h();
    }

    public static void main(String[] args) {
        All a = new All();
        takes1(a);
        takes2(a);
        takes3(a);
        takesAll(a);
    }
}
