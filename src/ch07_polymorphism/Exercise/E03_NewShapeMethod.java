package ch07_polymorphism.Exercise;

import ch07_polymorphism.Exercise.E03_newshape.Circle;
import ch07_polymorphism.Exercise.E03_newshape.Shape;
import ch07_polymorphism.Exercise.E03_newshape.Triangle;

/**
 * Created by Jienan on 2016/8/18.
 */
public class E03_NewShapeMethod {
    public static void main(String[] args) {
        Shape[] shapes = {
          new Circle(), new Shape(), new Triangle()
        };
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
