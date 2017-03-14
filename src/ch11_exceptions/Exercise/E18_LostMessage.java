package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/14.
 */
/****************** Exercise 18 *****************
 * Add a second level of exception loss to
 * LostMessage.java so that the HoHumException is
 * itself replaced by a third exception.
 ***********************************************/

class YetAnotherException extends Exception {
    public String toString() {
        return "Yet another exception";
    }
}

class VeryImportantException extends Exception {
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception";
    }
}

class LostMessage2 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    void cleanup() throws YetAnotherException {
        throw new YetAnotherException();
    }
}
public class E18_LostMessage {
    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.cleanup();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
