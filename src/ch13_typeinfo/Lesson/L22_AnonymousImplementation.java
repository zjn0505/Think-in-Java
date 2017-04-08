package ch13_typeinfo.Lesson;

import ch13_typeinfo.Lesson.L20_interface.A;

/**
 * Created by jienanzhang on 08/04/2017.
 */
// Anonymous inner classes can't hide from reflection.
class AnonymousA {
    public static A makeA() {
        return new A() {
            public void f() {
                System.out.println("public C.f()");
            }
            public void g() {
                System.out.println("public C.g()");
            }
            void u() {
                System.out.println("package C.u()");
            }
            protected void v() {
                System.out.println("protected C.v()");
            }
            private void w() {
                System.out.println("private C.w()");
            }
        };
    }
}
public class L22_AnonymousImplementation {
    public static void main(String[] args) throws Exception {
        A a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        L21_HiddenImplementation.callHiddenMethod(a, "g");
        L21_HiddenImplementation.callHiddenMethod(a, "u");
        L21_HiddenImplementation.callHiddenMethod(a, "v");
        L21_HiddenImplementation.callHiddenMethod(a, "w");
    }
}
