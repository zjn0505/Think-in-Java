package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 6/25/16.
 */
class A {
    A() {
        System.out.println("A()");
    }
}

class B {
    B() {
        System.out.println("B()");
    }
}

class C extends A{
    B b = new B();
}

public class E05_SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}
