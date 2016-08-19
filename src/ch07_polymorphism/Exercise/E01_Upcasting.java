package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/8/16.
 */

import ch07_polymorphism.Exercise.E01_cycle.Bicycle;
import ch07_polymorphism.Exercise.E01_cycle.Cycle;
import ch07_polymorphism.Exercise.E01_cycle.Tricycle;
import ch07_polymorphism.Exercise.E01_cycle.Unicycle;

/****************** Exercise 1 ****************
 * Create a Cycle class, with subclasses
 * Unicycle, Bicycle, and Tricycle. Demonstrate
 * that an instance of each type can be upcast
 * to Cycle via a ride() method.
 ***********************************************/
public class E01_Upcasting {
    public static void ride(Cycle c) {}
    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Bicycle());
        ride(new Unicycle());
        ride(new Tricycle());
    }

}
