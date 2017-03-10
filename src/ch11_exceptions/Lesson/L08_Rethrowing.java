package ch11_exceptions.Lesson;

/**
 * Created by jienanzhang on 10/03/2017.
 */
// Demonstrating fillInStackTrace()
public class L08_Rethrowing {
    public static void f() throws Exception {
        System.out.println("Originating the exception in f()");
        throw new Exception("thron from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(), e.printStackTrace()");
            e.printStackTrace();
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(), e.printStackTrace()");
            e.printStackTrace();
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        System.out.println("----------");
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}