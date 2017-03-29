package ch13_typeinfo.Exercise;

/**
 * Created by Jienan on 2017/3/29.
 */
/********************** Exercise 1 *********************
 * In ToyTest.java, comment out Toy's default constructor
 * and explain what happens.
 *******************************************************/

// Copy-pasted because these interfaces are not public
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    // Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1);}
}

public class E01_ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName()
                + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ch13_typeinfo.Exercise.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            // Requires default constructor: //! It is commented out
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
        printInfo(up);
    }
}
