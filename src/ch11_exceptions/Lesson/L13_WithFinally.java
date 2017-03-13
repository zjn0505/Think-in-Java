package ch11_exceptions.Lesson;


import com.sun.istack.internal.localization.NullLocalizable;

/**
 * Created by Jienan on 2017/3/13.
 */
public class L13_WithFinally {
    static L13_Switch sw = new L13_Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            L13_OnOffSwitch.f();
        } catch (L13_OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (L13_OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
