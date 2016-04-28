package ch05_Access.Exercise.debug;

/**
 * Created by Jienan on 2016/4/28.
 * Create two packages: debug and debugoff,
 * containing an identical class with a debug()
 * method. The first version displays its String
 * argument to the console, the second does nothing.
 * Import the class into a test program
 * using a static import line, and demonstrate
 * the conditional compilation effect.
 */
public class E03_Debug {
    public static void debug(String msg) {
        System.out.println("Message: " + msg);
    }
}
