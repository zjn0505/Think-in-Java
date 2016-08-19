package ch07_polymorphism.Exercise;

import ch07_polymorphism.Exercise.E02_oshape.Shape;
import ch07_polymorphism.Exercise.E02_oshape.RandomShapeGenerator;

/**
 * Created by Jienan on 2016/8/18.
 */
public class E02_Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++)
            shapes[i] = gen.next();
        for (Shape shp: shapes)
            shp.draw();
    }
}
