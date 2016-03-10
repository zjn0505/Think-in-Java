package ch02_Operators;

/**
 * Cast float or double to an integer
 *
 * Created by Jienan on 2016/3/10.
 *
 */
public class L08_RoundingNumbers {
    public static void main(String[] args) {
        double d1 = 0.7, d2 = -0.7;
        float f1 = 0.7f, f2 = -0.5f;

        System.out.println("Math.round(d1): " + Math.round(d1));
        System.out.println("Math.round(d2): " + Math.round(d2));
        System.out.println("Math.round(f1): " + Math.round(f1));
        System.out.println("Math.round(f2): " + Math.round(f2));

    }



}
