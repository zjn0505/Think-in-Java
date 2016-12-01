package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/11/14.
 */

class D {}
abstract class E {}
class Z extends D {
    E makeE() { return new E() {}; }
}
public class L23_MultiImplementation {
    static void takeD(D d) {}
    static void takeE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
