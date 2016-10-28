package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/25.
 */
// Qualifying access to the outer-class object
public class L04_DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public L04_DotThis outer() {
            return L04_DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }
    public Inner inner() { return new Inner(); }
    public static void main(String[] args) {
        L04_DotThis dt = new L04_DotThis();
        L04_DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
