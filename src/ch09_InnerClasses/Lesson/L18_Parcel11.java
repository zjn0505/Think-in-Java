package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Contents;
import ch09_InnerClasses.Destination;

/**
 * Created by Jienan on 2016/11/11.
 */
// Nested classes (static inner classes).
public class L18_Parcel11 {
    private static class ParcelContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination {
        private String label;
        private ParcelDestination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
        // Nested classes can contatin other static elements:
        public static void f() {}
        static int x = 10;
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }
    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }
    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }
}
