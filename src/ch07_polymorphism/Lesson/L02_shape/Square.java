package ch07_polymorphism.Lesson.L02_shape;

/**
 * Created by Jienan on 2016/8/18.
 */
public class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}