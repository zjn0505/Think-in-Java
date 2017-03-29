package ch13_typeinfo.Exercise;
/**
 * Created by Jienan on 2017/3/29.
 */

import ch07_polymorphism.Lesson.L02_shape.Circle;
import ch07_polymorphism.Lesson.L02_shape.Shape;
import ch07_polymorphism.Lesson.L02_shape.Square;
import ch07_polymorphism.Lesson.L02_shape.Triangle;

import java.util.Arrays;
import java.util.List;

/****************** Exercise 3 ******************
 * Add Rhomboid to Shapes.java. Create a
 * Rhomboid, upcast it to a Shape, then downcast
 * it back to a Rhomboid. Try downcasting to a
 * Circle and see what happens.
 ***********************************************/

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class E03_Rhomboid {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle(),
                new Rhomboid()
        );
        for(Shape shape : shapes)
            shape.draw();
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid)shape;
        // Downcast to Circle. Succeeds at compile time,
        // but fails at runtime with a ClassCastException:
        //! Circle c = (Circle)shape;
    }
}
