package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/24.
 */
/****************** Exercise 17 ******************
 * Prove that the fields in an interface are
 * implicitly static and final.
 ***********************************************/

interface StaticFinalTest {
    String RED = "Red";
}

class Test implements StaticFinalTest {
    public Test() {
//!        RED = "blue";
    }
}

public class E17_ImplicitStaticFinal {
    public static void main(String[] args) {
        System.out.println("StaticFinalTest.RED = "
        + StaticFinalTest.RED);
    }
}
