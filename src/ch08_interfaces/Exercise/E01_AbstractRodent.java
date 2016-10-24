package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */
/****************** Exercise 1 *****************
 * Modify Exercise 9 in the previous chapter so
 * Rodent is an abstract class. Make the
 * methods of Rodent abstract whenever possible.
 ***********************************************/

abstract class Rodent {
    public abstract void hop();
    public abstract void scurry();
    public abstract void reproduce();
}

class Mouse extends Rodent {
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

class Gerbil extends Rodent {
    public void hop() {
        System.out.println("Gerbil hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurring");
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

class Hamster extends Rodent {
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

public class E01_AbstractRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };
        for (Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
