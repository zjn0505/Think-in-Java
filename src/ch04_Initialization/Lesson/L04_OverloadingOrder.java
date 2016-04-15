package ch04_Initialization.Lesson;

/**
 * Overloading based on the order of the arguments
 * Created by Jienan on 2016/3/11.
 */
public class L04_OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }
    static void f(int i, String s){
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}
