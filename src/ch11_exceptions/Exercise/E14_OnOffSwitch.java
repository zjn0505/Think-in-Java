package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/13.
 */

import ch11_exceptions.Lesson.L13_OnOffException1;
import ch11_exceptions.Lesson.L13_OnOffException2;
import ch11_exceptions.Lesson.L13_Switch;

/****************** Exercise 14 *****************
 * Show that OnOffSwitch.java can fail by
 * throwing a RuntimeException inside the try
 * block.
 ***********************************************/
public class E14_OnOffSwitch {
    static L13_Switch sw = new L13_Switch();
    static void f() throws L13_OnOffException1, L13_OnOffException2 {
        throw new RuntimeException("Inside try");
    }

    public static void main(String[] args) {
        try {
            try {
                sw.on();
                // Code that can throw exceptions...
                f();
                sw.off();
            } catch (L13_OnOffException1 e) {
                System.out.println("OnOffException1");
                sw.off();
            } catch (L13_OnOffException2 e) {
                System.out.println("OnOffException2");
                sw.off();
            }
        } catch (RuntimeException e) {
            System.out.println(sw);
            System.out.println("Oops! the exception '" + e + "' slipped through without turning the switch off!");
        }
    }
}
