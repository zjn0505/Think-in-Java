package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 6/25/16.
 * Prove that base-class constructors are (a)
 * always called and (b) called before
 * derived-class constructors.
 */

class Base1 {
    Base1() {
        System.out.println("Base1");
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("Derived1");
    }
}

class Derived2 extends Derived1 {
    Derived2() {
        System.out.println("Derived2");
    }
}

public class E04_ConstructorOrder {
    public static void main(String[] args) {
        new Derived2();
    }
}
