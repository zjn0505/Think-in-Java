package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2017/2/22.
 */

// Proper inheritance of an inner class.
class Egg2 {
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }
    private Yolk y = new Yolk();
    public Egg2() {
        System.out.println("New Egg2()");
    }
    public void insertYolk(Yolk yy) {
        y = yy;
    }
    public void g() { y.f(); }
}
public class L28_BigEgg2 extends  Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }
    public L28_BigEgg2() {
        insertYolk(new Egg2.Yolk());
    }

    public static void main(String[] args) {
        Egg2 e2 = new L28_BigEgg2();
        e2.g();
    }
}
