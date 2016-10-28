package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */

import ch09_InnerClasses.Exercise.e06.SimpleInterface;

/****************** Exercise 11 *****************
 * Create a private inner class that implements a
 * public interface. Write a method that returns
 * a reference to an instance of the private
 * inner class, upcast to the interface. Show
 * that the inner class is completely hidden by
 * trying to downcast to it.
 ************************************************/

class Outer5 {
    private class Inner implements SimpleInterface {

        @Override
        public void f() {
            System.out.println("Outer5.Inner.f");
        }
    }
    public SimpleInterface get() { return new Inner(); }
    public Inner get2() { return new Inner(); }
}
public class E11_HiddenInnerClass {
    public static void main(String[] args) {
        Outer5 out = new Outer5();
        SimpleInterface si = out.get();
        si = out.get2();
        //! Inner i1 = out.get2();
        //! Inner i2 = (Inner)si;
    }
}
