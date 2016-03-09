package ch02_Operators;

/**
 * Demonstrate the ++ and -- operators.
 * Created by Jienan on 2016/3/9.
 */
public class L01_AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i   : " + i);
        System.out.println("++i : " + ++i); // Pre-increment
        System.out.println("i++ : " + i++); // Post-increment
        System.out.println("i   : " + i);
        System.out.println("--i : " + --i); // Pre-decrement
        System.out.println("i-- : " + i--); // Post-decrement
        System.out.println("i   : " + i);

    }

}
