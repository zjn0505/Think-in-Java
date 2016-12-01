package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 8/13/16.
 */
class ThreeOverloads {
    public void f(int i) {
        System.out.println("f(int i)");
    }
    public void f(char c) {
        System.out.println("f(char c)");
    }
    public void f(double d) {
        System.out.println("f(double d)");
    }
}

class MoreOverloads extends ThreeOverloads {
    public void f(String s) {
        System.out.println("f(String s)");
    }
}

public class E13_InheritedOverloading {
    public static void main(String[] args) {
        MoreOverloads mo = new MoreOverloads();
        mo.f(1);
        mo.f('d');
        mo.f(1.1);
        mo.f("Hello");
    }

}
