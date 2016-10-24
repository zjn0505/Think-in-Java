package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */

import ch07_polymorphism.Lesson.L06_Sandwich;

/****************** Exercise 8 ******************
 * Create an interface called FastFood (with
 * appropriate methods) in
 * polymorphism.Sandwich.java, and change Sandwich
 * so it also implements FastFood.
 ***********************************************/

interface FastFood {
    void rushOrder();
    void gobble();
}

class FastSandwich extends L06_Sandwich implements FastFood {

    @Override
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
    }

    @Override
    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    public static void main(String[] args) {
        FastSandwich burger = new FastSandwich();
        System.out.println("Fris with that?");
        System.out.println("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}
