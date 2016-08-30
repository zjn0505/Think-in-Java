package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/8/30.
 */

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
public class L06_Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public L06_Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new L06_Sandwich();
    }
}
