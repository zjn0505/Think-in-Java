package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/4/1.
 */
public class L24_OverloadingVarargs3 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }
    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');

    }
}
