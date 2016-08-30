package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/8/30.
 */
public class L03_PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        L03_PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends L03_PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
