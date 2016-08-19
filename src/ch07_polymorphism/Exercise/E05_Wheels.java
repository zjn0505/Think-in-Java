package ch07_polymorphism.Exercise;

import ch07_polymorphism.Exercise.E05_cycle2.Bicycle;
import ch07_polymorphism.Exercise.E05_cycle2.Cycle;
import ch07_polymorphism.Exercise.E05_cycle2.Tricycle;
import ch07_polymorphism.Exercise.E05_cycle2.Unicycle;

/**
 * Created by Jienan on 2016/8/18.
 */
public class E05_Wheels {
    public static void ride(Cycle c) {
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
