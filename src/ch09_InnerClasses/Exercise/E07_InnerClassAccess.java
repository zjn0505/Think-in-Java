package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */
/****************** Exercise 7 *****************
 * Create a class with a private field and a
 * private method. Create an inner class with a
 * method that modifies the outer-class field and
 * calls the outer-class method. In a second
 * outer-class method, create an object of the
 * inner class and call its method, then show
 * the effect on the outer-class object.
 ***********************************************/
public class E07_InnerClassAccess {
    private int i = 10;
    private void f() {
        System.out.println("E07_InnerClassAccess.f");
    }
    class Inner {
        void g() {
            i++;
            f();
        }
    }
    public void h() {
        Inner in = new Inner();
        in.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        E07_InnerClassAccess ica = new E07_InnerClassAccess();
        ica.h();
    }
}
