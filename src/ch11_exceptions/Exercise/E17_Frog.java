package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/13.
 */

import ch07_polymorphism.Lesson.L07_Frog;

/****************** Exercise 17 *****************
 * Modify polymorphism/Frog.java so that it uses
 * try-finally to guarantee proper cleanup, and
 * show that this works even if you return from the
 * middle of the try-finally.
 ***********************************************/
class Frog2 extends L07_Frog {
    protected void dispose() { super.dispose(); }
}
public class E17_Frog {
    public static void main(String[] args) {
        Frog2 frog = new Frog2();
        try {

        } finally {
            frog.dispose();
        }
        frog = new Frog2();
        try {
            return;
        } finally {
            frog.dispose();
        }
    }
}
