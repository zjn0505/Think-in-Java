package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 09/04/2017.
 */
public class L01_Holder3<T> {
    private T a;
    public L01_Holder3(T a) { this.a = a; }
    public void set(T a) { this.a = a; }
    public T get() { return a; }

    public static void main(String[] args) {
        L01_Holder3<Automobile> h3 = new L01_Holder3(new Automobile());
        Automobile a = h3.get(); // No cast needed
        // h3.set("Not an Automobile"); // Error
        // h3.set(1);                   // Error
    }
}
