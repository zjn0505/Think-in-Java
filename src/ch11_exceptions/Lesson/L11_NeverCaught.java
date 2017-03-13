package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/13.
 */
public class L11_NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }
    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
