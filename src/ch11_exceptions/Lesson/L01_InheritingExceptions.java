package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/6.
 */
// Creating your own exceptions.

class SimpleException extends Exception {}
public class L01_InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        L01_InheritingExceptions sed = new L01_InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }

    }
}
