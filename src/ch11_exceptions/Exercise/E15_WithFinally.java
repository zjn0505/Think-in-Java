package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/13.
 */

import ch11_exceptions.Lesson.L13_OnOffException1;
import ch11_exceptions.Lesson.L13_OnOffException2;
import ch11_exceptions.Lesson.L13_Switch;

/****************** Exercise 15 *****************
 * Show that WithFinally.java doesn't fail by
 * throwing a RuntimeException inside the try
 * block.
 ***********************************************/
public class E15_WithFinally {
    static L13_Switch sw = new L13_Switch();
    static void f() throws L13_OnOffException1, L13_OnOffException2 {
        throw new RuntimeException("Inside try");
    }

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                f();
            } catch (L13_OnOffException1 e) {
                System.out.println("OnOffException1");
            } catch (L13_OnOffException2 e) {
                System.out.println("OnOffException2");
            } finally {
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println("Exception '" + e + "'. Did the switch get turned off?");
            System.out.println(sw);
        }
    }
}
