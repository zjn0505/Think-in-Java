package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2017/2/22.
 */
// Inheriting an inner class.

class WithInner {
    class Inner {}
}

public class L26_InheritInner extends WithInner.Inner {
    L26_InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        L26_InheritInner ii = new L26_InheritInner(wi);
    }
}
