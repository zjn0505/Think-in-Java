package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/27.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/****************** Exercise 10 ******************
 * change Exercise 9 in the Polymorphism chapter
 * to use an ArrayList to hold the Rodents and an
 * Iterator to move through their sequence.
 ***********************************************/
class Rodent {
    public void hop() {
        System.out.println("Rodent hopping");
    }
    public void scurry() {
        System.out.println("Rodent scurry");
    }
    public void reproduce() {
        System.out.println("Making more Rodents");
    }
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    @Override
    public void hop() {
        System.out.println("Mouse hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurring");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Mice");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}



class Hamster extends Rodent {
    @Override
    public void hop() {
        System.out.println("Hamster hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurring");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

public class E10_RodentIterator {
    public static void main(String[] args) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>(
                Arrays.asList(
                        new Rodent(), new Mouse(), new Hamster()
                )
        );
        Rodent r;
        for (Iterator<Rodent> it = rodents.iterator();
                it.hasNext();) {
            r = it.next();
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
