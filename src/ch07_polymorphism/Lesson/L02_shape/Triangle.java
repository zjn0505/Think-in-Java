package ch07_polymorphism.Lesson.L02_shape;

/**
 * Created by Jienan on 2016/8/16.
 */
public class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase() {
        System.out.println("Triangle.erase()");
    }
}
