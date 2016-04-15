package ch04_Initialization.Exercise;

/**
 * Create a class with a String that is
 * initialized using "instance initialization"
 * Created by Jienan on 2016/3/31.
 */
public class E15_StringInstanceInitialization {
    String s;
    {
        s = "'instance initialization'";
    }
    public E15_StringInstanceInitialization() {
        System.out.println("Default constructor: s = " + s);
    }
    public E15_StringInstanceInitialization(int i) {
        System.out.println("ini constructor: s = " + s);
    }

    public static void main(String[] args) {
        new E15_StringInstanceInitialization();
        new E15_StringInstanceInitialization(1);
    }
}
