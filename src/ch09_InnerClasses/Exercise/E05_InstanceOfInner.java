package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */
/****************** Exercise 5 *****************
 * Create a class with an inner class. In a
 * separate class, make an instance of the inner
 * class.
 ***********************************************/

class Outer3 {
    class Inner {
        {
            System.out.println("Inner created");
        }
    }
}

public class E05_InstanceOfInner {
    public static void main(String[] args) {
        Outer3.Inner i = new Outer3().new Inner();
    }
}
