package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 01/05/2017.
 */

class Manipulator<T> {
    private T obj;
    public Manipulator(T x) { obj = x; }
    // Error: cannot find symbol: method f():
    public void manipulte() {
    //!    obj.f(); // unlike C++ this will fail on complie
    }
}

public class L18_Manipulation {
    public static void main(String[] args) {
        L18_HasF hasF = new L18_HasF();
        Manipulator<L18_HasF> manipulator =
            new Manipulator<L18_HasF>(hasF);
        manipulator.manipulte();
    }
}
