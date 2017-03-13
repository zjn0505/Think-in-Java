package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/13.
 */
public class L13_OnOffSwitch {
    private static L13_Switch sw = new L13_Switch();
    public static void f() throws L13_OnOffException1, L13_OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (L13_OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (L13_OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
