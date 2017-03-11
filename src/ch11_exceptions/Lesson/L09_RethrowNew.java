package ch11_exceptions.Lesson;

/**
 * Created by jienanzhang on 11/03/2017.
 */
// Rethrow a different object from the one that was caught.

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class L09_RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }
    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println(
                        "Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println(
                    "Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
