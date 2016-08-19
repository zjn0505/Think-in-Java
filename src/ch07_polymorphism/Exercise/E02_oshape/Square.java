package ch07_polymorphism.Exercise.E02_oshape;

/**
 * Created by Jienan on 2016/8/18.
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}