package ch09_InnerClasses.Exercise.e06b;

import ch09_InnerClasses.Exercise.e06.SimpleInterface;

/**
 * Created by Jienan on 2016/10/26.
 */
public class SimpleClass {
    protected class Inner implements SimpleInterface {
        // Force constructor to be public:
        public Inner() {}
        public void f() {}
    }
}
