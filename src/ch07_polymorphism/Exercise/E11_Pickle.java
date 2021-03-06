package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/8/30.
 */
class Pickle {
    Pickle() {
        System.out.println("Pickle()");
    }
}
class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}
class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}
class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}
class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

class Sandwich2 extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    Sandwich2() {
        System.out.println("Sandwich()");
    }
}

public class E11_Pickle {
    public static void main(String[] args) {
        new Sandwich2();
    }
}
