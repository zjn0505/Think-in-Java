package ch04_Initialization.Lesson;

/**
 * Explicit static initialization with the "static" clause.
 * Created by Jienan on 2016/3/16.
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static Cup cup3;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
        Cup cup3 = new Cup(3);
        cup3 = new Cup(33);
        Cup cup4 = new Cup(4);
    }
    Cups() {
        System.out.println("Cups()");
    }
}

public class L12_ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();

}
