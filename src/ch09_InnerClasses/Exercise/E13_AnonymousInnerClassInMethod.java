package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */

import ch09_InnerClasses.Exercise.e06.SimpleInterface;

/****************** Exercise 13 *****************
 * Repeat Exercise 9 using an anonymous inner
 * class.
 ***********************************************/
public class E13_AnonymousInnerClassInMethod {
    public SimpleInterface get() {
        return new SimpleInterface() {
            @Override
            public void f() {
                System.out.println("SimpleInterface.f");
            }
        };
    }

    public static void main(String[] args) {
        SimpleInterface si =
                new E13_AnonymousInnerClassInMethod().get();
        si.f();
    }
}
