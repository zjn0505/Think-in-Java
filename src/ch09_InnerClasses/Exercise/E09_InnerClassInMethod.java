package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */

import ch09_InnerClasses.Exercise.e06.SimpleInterface;

/****************** Exercise 9 *****************
 * Create an interface with at least one method,
 * and implement it by defining an
 * inner class within a method that returns a
 * reference to your interface.
 ***********************************************/
public class E09_InnerClassInMethod {
    public SimpleInterface get() {
        class SI implements SimpleInterface {
            public void f() {
                System.out.println("SI.f");
            }
        }
        return new SI();
    }

    public static void main(String[] args) {
        SimpleInterface si = new E09_InnerClassInMethod().get();
        si.f();
    }
}
