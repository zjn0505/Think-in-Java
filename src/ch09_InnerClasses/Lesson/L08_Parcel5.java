package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Destination;

/**
 * Created by Jienan on 2016/10/26.
 */
// Nesting a class within a method.
public class L08_Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        L08_Parcel5 p = new L08_Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
