package ch11_exceptions.Lesson;

/**
 * Created by jienanzhang on 10/03/2017.
 */
// Programmatic access to stack trace information
public class L07_WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g() { f(); }
    static void h() { g(); }

    public static void main(String[] args) {
        f();
        System.out.println("................");
        g();
        System.out.println("................");
        h();
        System.out.println("................");
    }
}
