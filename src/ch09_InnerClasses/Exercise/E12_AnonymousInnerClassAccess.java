package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */
/****************** Exercise 12 *****************
 * Repeat Exercise 7 using an anonymous inner
 * class.
 ***********************************************/
public class E12_AnonymousInnerClassAccess {
    private int i = 10;
    private void f() {
        System.out.println("E12_AnonymousInnerClassAccess");
    }
    public void h() {
        new Object() {
            void g() {
                i++;
                f();
            }
        }.g();
    }

    public static void main(String[] args) {
        E12_AnonymousInnerClassAccess ica =
                new E12_AnonymousInnerClassAccess();
        ica.h();
    }
}
