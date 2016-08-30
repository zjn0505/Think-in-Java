package ch07_polymorphism.Exercise;

/**
 * Created by Jienan on 2016/8/30.
 */
class Member {
    public Member(String id) {
        System.out.println("Member constructor " + id);
    }
}

class Rodent2 {
    Member m1 = new Member("r1"), m2 = new Member("r2");
    public Rodent2() {
        System.out.println("Rodent constructor");
    }
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

class Mouse2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");
    Mouse2() {
        System.out.println("Mouse constructor");
    }
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

class Gerbil2 extends Rodent2 {
    Member m1 = new Member("g1"), m2 = new Member("g2");
    public Gerbil2() {
        System.out.println("Gerbil constructor");
    }
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

class Hamster2 extends Rodent2 {
    Member m1 = new Member("h1"), m2 = new Member("h2");
    public Hamster2() {
        System.out.println("Hamster constructor");
    }
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

public class E12_RodentInitialization {
    public static void main(String[] args) {
        new Hamster2();
    }
}
