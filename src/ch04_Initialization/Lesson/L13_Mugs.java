package ch04_Initialization.Lesson;

/**
 * Java "Instance Initialization."
 * Created by Jienan on 2016/3/31.
 */
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f" + marker + ")");
    }
}

public class L13_Mugs {
    static Mug mug1;
    static Mug mug2;
    static {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mug mug3;
    Mug mug4;
    {
        mug3 = new Mug(3);
        mug4 = new Mug(4);
        System.out.println("mug3 & mug4 initialized");
    }

    L13_Mugs() {
        System.out.println("Mugs()");
    }
    L13_Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new L13_Mugs();
        System.out.println("new Mugs() completeed");
        new L13_Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
