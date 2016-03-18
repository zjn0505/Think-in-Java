package ch04_Initialization;

/**
 * Calling constructors with "this"
 * Created by Jienan on 2016/3/16.
 */
public class L08_Flower {
    int petalCount = 0;
    String s  ="initial value";
    L08_Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = "
                + petalCount);
    }

    L08_Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s = "
                + ss);
        s = ss;
    }

    L08_Flower(String s, int petals) {
        this(petals);
//        this(s); Can't call two!
        this.s = s;
        System.out.println("String & int args");
    }
    L08_Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
//        this(11);  // not a constructor
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        L08_Flower flower = new L08_Flower();
        flower.printPetalCount();
    }

}
