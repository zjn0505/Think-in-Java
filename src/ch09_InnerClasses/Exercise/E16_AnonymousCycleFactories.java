package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/26.
 */
/****************** Exercise 16 ******************
 * Use anonymous inner classes to modify the
 * solution to Exercise 18 from the Interfaces chapter.
 ***********************************************/

interface Cycle {
    int wheels();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public int wheels() {
        return 1;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    public int wheels() {
        return 2;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle {
    public int wheels() {
        return 3;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class E16_AnonymousCycleFactories {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }
}
