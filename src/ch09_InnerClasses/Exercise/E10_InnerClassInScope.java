package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */

import ch09_InnerClasses.Exercise.e06.SimpleInterface;

/****************** Exercise 10 *****************
 * Repeat Exercise 9 but define the inner
 * class within a scope within a method.
 ************************************************/
public class E10_InnerClassInScope {
    public SimpleInterface get() {
        {
            class SI implements SimpleInterface {
                public void f() {
                    System.out.println("SI.f");
                }
            }
            return new SI();
        }
    }

    public static void main(String[] args) {
        SimpleInterface si = new E10_InnerClassInScope().get();
        si.f();
    }
}
