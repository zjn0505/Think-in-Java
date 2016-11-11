package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/11/11.
 */

/**
 * Create a class containing a nested class.
 * In main(), create an instance of the nested class.
 */
public class E18_NestedClass {
    static class Nested {
        void f() {
            System.out.println("Nested.f");
        }
    }

    public static void main(String[] args) {
        Nested ne = new Nested();
        ne.f();
    }
}

class Other {
    void f() {
        E18_NestedClass.Nested ne = new E18_NestedClass.Nested();
    }
}