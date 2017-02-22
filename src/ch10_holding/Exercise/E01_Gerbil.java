package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/22.
 */

import java.util.ArrayList;

/****************** Exercise 1 ******************
 * Create a new class called Gerbil with an int
 * gerbilNumber initialized in the constructor.
 * Give it a method called hop() that prints out
 * which gerbil number this is, and that it’s hopping.
 * Create an ArrayList and add Gerbil objects to
 * the List. Now use the get() method to move
 * through the List and call hop() for each Gerbil.
 **********************************************/

class Gerbil {
    private final int gerbilNumber;
    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }
    public String toString() {
        return "gerbil " + gerbilNumber;
    }
    public void hop() {
        System.out.println(this + " is hoping");
    }
}

public class E01_Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}
