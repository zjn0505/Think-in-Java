package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 09/04/2017.
 */
public class L01_Holder2 {
    private Object a;
    public L01_Holder2(Object a) { this.a = a; }
    public void set(Object a) { this.a = a; }
    public Object get() { return a; }

    public static void main(String[] args) {
        L01_Holder2 h2 = new L01_Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();
        h2.set("Not an Automobile");
        String s = (String) h2.get();
        h2.set(1);
        Integer x = (Integer) h2.get();
    }
}

// Holder2 can hold any class