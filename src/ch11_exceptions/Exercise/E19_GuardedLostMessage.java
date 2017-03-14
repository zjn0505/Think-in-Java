package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/14.
 */

import ch11_exceptions.Lesson.L16_LostMessage;

/****************** Exercise 19 *****************
 * Repair the problem in LostMessage.java by
 * guarding the call in the finally clause.
 ***********************************************/
public class E19_GuardedLostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            E19_GuardedLostMessage lm = new E19_GuardedLostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch (HoHumException e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
