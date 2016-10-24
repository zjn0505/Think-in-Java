package ch08_interfaces.Lesson;

import java.util.Random;

/**
 * Created by Jienan on 2016/10/20.
 */
public class L10_RandomDoubles {
    private static Random rand = new Random(47);
    public double next() { return rand.nextDouble(); }

    public static void main(String[] args) {
        L10_RandomDoubles rd = new L10_RandomDoubles();
        for (int i = 0; i < 7; i++)
            System.out.print(rd.next() + " ");
    }
}
