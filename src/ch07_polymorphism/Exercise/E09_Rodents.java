package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/8/30.
 */
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

class Gerbil extends Rodent {
    @Override
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

public class E09_Rodents {
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
