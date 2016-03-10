package ch02_Operators;

/**
 * Cast float or double to an integer
 *
 * Created by Jienan on 2016/3/10.
 *
 */
public class L07_CastingNumbers {
    public static void main(String[] args) {
        double d1 = 0.7, d2 = -0.4;
        float f1 = 0.7f, f2 = -0.5f;

        // casting always truncates the number
        System.out.println("(int)d1: " + (int)d1);
        System.out.println("(int)d2: " + (int)d2);
        System.out.println("(int)f1: " + (int)f1);
        System.out.println("(int)f2: " + (int)f2);

    }



}
