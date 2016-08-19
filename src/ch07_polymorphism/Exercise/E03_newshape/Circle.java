package ch07_polymorphism.Exercise.E03_newshape;

/**
 * Created by Jienan on 2016/8/16.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Circle.msg()");
    }
}
