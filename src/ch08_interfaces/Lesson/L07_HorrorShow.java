package ch08_interfaces.Lesson;

/**
 * Created by Jienan on 2016/10/20.
 */
// Extending an Interface with inheritance.

interface Monster {
    void menace();
}

interface DangerMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements  DangerMonster {
    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

interface Vampire extends DangerMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    @Override
    public void drinkBlood() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void menace() {

    }
}

public class L07_HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }

    public static void main(String[] args) {
        DangerMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire valid = new VeryBadVampire();
        u(valid);
        v(valid);
    }
}
