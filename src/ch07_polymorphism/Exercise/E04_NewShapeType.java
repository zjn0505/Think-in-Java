package ch07_polymorphism.Exercise;

import ch07_polymorphism.Exercise.E03_newshape.*;

/**
 * Created by Jienan on 2016/8/18.
 */
public class E04_NewShapeType {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(), new Square(), new Triangle(),
            new Tetrahedron()
        };

        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            shape.msg();
        }
    }
}
