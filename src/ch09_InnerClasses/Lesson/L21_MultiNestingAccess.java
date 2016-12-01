package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/11/14.
 */

class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                f();
                g();
            }
        }
    }
}

public class L21_MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
