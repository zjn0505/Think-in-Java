package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */
/****************** Exercise 8 *****************
 * Determine whether an outer class has access to
 * the private elements of its inner class.
 ***********************************************/

class Outer4 {
    class Inner {
        private int j;
        private void h() {
            System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
        }
    }
    public void testInnerAccess() {
        Inner i = new Inner();
        i.j = 47;
        i.h();
    }
}

public class E08_OuterAccessingInner {
    public static void main(String[] args) {
        new Outer4().testInnerAccess();
    }
}
