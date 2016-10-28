package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Destination;

/**
 * Created by Jienan on 2016/10/26.
 */
// An anonymous inner class that performs
// initialization. A briefer version of Parcel5
public class L13_Parcel9 {
    // Argument must be final to use inside anonymous inner class;
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        new L13_Parcel9().destination("Tasmania");
    }
}
