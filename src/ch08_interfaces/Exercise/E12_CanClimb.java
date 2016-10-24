package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/19.
 */
/****************** Exercise 12 ******************
 * Follow the form of the other
 * interfaces to add an interface called
 * CanClimb in Adventure.java.
 ***********************************************/
interface CanClimb {
    void climb();
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {}
}

class Hero2 extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }
}


public class E12_CanClimb {
    static void t(CanFight x) { x.fight();}
    static void u(CanSwim x) { x.swim();}
    static void v(CanFly x) { x.fly();}
    static void z(CanClimb x) { x.climb(); }
    static void w(ActionCharacter x) { x.fight();}

    public static void main(String[] args) {
        Hero2 h = new Hero2();
        t(h);
        u(h);
        v(h);
        w(h);
        z(h);
    }
}
