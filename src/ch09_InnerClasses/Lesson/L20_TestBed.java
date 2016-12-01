package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/11/14.
 */
// Putting test code in a nested class.
public class L20_TestBed {
    public void f() {
        System.out.println("f()");
    }
    public static class Tester {
        public static void main(String[] args) {
            L20_TestBed t = new L20_TestBed();
            t.f();
        }
    }
}
