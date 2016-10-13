package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */
// {ThrowsException}

import ch07_polymorphism.Exercise.E01_cycle.Cycle;
import ch07_polymorphism.Exercise.E17_cycle3.Bicycle;
import ch07_polymorphism.Exercise.E17_cycle3.Tricycle;
import ch07_polymorphism.Exercise.E17_cycle3.Unicycle;

/****************** Exercise 17 ****************
 * * Add a balance() method to Unicycle and Bicycle
 * but not to Tricycle, using the Cycle hierarchy
 * from Exercise 1. Upcast instances of all
 * three types to an array of Cycle. Try to call
 * balance() on each element of the array and
 * observe the results. Downcast and call
 * balance() and observe what happens.
 ***********************************************/
public class E17_RTTI {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[] {
            new Unicycle(),
            new Bicycle(),
            new Tricycle()
        };
        // Compile time: method not found in Cycle;
        // cycles[0].balance();
        // cylces[1].balance();
        // cycles[2].balance();
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        ((Unicycle) cycles[2]).balance(); // Exception thrown

    }
}
