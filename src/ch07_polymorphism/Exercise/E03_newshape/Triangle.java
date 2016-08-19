package ch07_polymorphism.Exercise.E03_newshape;

/**
 * Created by Jienan on 2016/8/16.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void msg() {
        System.out.println("Triangle.msg()");
    }
}
