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

/****************** Exercise 4 ******************
 * Modify the previous exercise so that it uses
 * instanceof to check the type before performing
 * * the downcast.
 ***********************************************/
public class E04_Instanceof {
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

        Circle c = null;
        if (shape instanceof Circle)
            c = (Circle)shape;
        else
            System.out.println("shape not a Circle");
    }
}
