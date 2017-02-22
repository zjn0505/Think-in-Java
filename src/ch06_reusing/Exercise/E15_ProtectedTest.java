package ch06_reusing.Exercise;

import ch06_reusing.Exercise.E15_Protected.E15_Protected;

/**
 * Created by jienanzhang on 8/13/16.
 */
class Derived extends E15_Protected {
    public void g() {
        f();
    }
}

public class E15_ProtectedTest {
    public static void main(String[] args) {
//        new E15_Protected().f(); // Cannot access
        new Derived().g();

    }
}
