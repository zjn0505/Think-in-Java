package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/13.
 */

import ch06_reusing.Lesson.L08_CADSystem;

/****************** Exercise 16 *****************
 * Modify reusing/CADSystem.java to demonstrate
 * that returning from the middle of a try-finally
 * will still perform proper cleanup.
 ***********************************************/
public class E16_CADSystem {
    public static void main(String[] args) {
        L08_CADSystem x = new L08_CADSystem(47);
        try {
            return;
        } finally {
            x.dispose();
        }
    }
}
