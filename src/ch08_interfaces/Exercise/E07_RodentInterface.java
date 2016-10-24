package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */
/****************** Exercise 7 ******************
 * Change Rodent to an interface in Exercise 9 of
 * the Polymorphism chapter.
 ***********************************************/

interface Rodent2 {
    void hop();
    void scurry();
    void reproduce();
}

class Mouse2 implements Rodent2 {
    @Override
    public void hop() {
        System.out.println("Mouse hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurrying");
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

class Gerbil2 implements Rodent2 {
    @Override
    public void hop() {
        System.out.println("Gerbil hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Gerbils");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

class Hamster2 implements Rodent2 {
    @Override
    public void hop() {
        System.out.println("Hamster hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurrying");
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

public class E07_RodentInterface {
    public static void main(String[] args) {
        Rodent2[] rodents = {
            new Mouse2(),
            new Gerbil2(),
            new Hamster2()
        };
        for (Rodent2 r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
