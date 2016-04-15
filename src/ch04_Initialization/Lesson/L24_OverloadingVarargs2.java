package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/4/1.
 */
public class L24_OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(Character... args) {
        System.out.println("second");
    }
    static void f(String... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f(1, 'a');
//        f('a', 'b');
        f("a", "b");

    }
}
