package ch07_polymorphism.Lesson;

import ch07_polymorphism.Lesson.L02_shape.RandomShapeGenerator;
import ch07_polymorphism.Lesson.L02_shape.Shape;

/**
 * Created by Jienan on 2016/8/18.
 */
public class L02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        for (int i = 0; i < s.length; i++)
            s[i] = gen.next();
        for (Shape shp : s)
            shp.draw();
    }
}
