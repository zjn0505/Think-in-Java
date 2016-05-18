package ch06_reusing.Lesson;

/**
 * Created by Jienan on 2016/4/28.
 * Initialization
 * 1. At the point the objects are defined. This means that they’ll always be initialized
 * before the constructor is called.
 * 2. In the constructor for that class.
 * 3. Right before you actually need to use the object. This is often called lazy
 * initialization. It can reduce overhead in situations where object creation is expensive
 * and the object doesn’t need to be created every time.
 * 4. Using instance initialization.
 */
class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

public class L02_Bath {
    private String // Initializing at point of definition:
        s1 = "Happy",
        s2 = "Happy",
        s3, s4;
    private Soap castille;
    private int i;
    private float toy;
    public L02_Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // Instance initialization
    { i = 47; }
    public String toString() {
        if(s4 == null) // Delayed initialization:
            s4 = "Joy";
        return
            "s1 = " + s1 + "\n" +
            "s2 = " + s2 + "\n" +
            "s3 = " + s3 + "\n" +
            "s4 = " + s4 + "\n" +
            "i = " + i + "\n" +
            "castille = " + castille;
    }

    public static void main(String[] args) {
        L02_Bath b = new L02_Bath();
        System.out.println(b);
    }
}
