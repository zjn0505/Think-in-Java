package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/25.
 */
// Using .new to create instances of inner classes.
public class L06_Parcel3 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) { label = whereTo; }
        String readLabel() { return label; }
    }

    public static void main(String[] args) {
        L06_Parcel3 p = new L06_Parcel3();
        // Must use instance of outer class
        // to create an instance of the inner class;
        L06_Parcel3.Contents c = p.new Contents();
        L06_Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
