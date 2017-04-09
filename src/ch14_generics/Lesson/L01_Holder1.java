package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 09/04/2017.
 */
// Holder that only holds one instance of a single class
class Automobile {}

public class L01_Holder1 {
    private Automobile a;
    public L01_Holder1(Automobile a) { this.a = a; }
    Automobile get() { return a; }
}

// hard to be reused since it cannot hold other type of class.