package ch07_polymorphism.Lesson.L02_shape;

import java.util.Random;

/**
 * Created by Jienan on 2016/8/18.
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }

}
