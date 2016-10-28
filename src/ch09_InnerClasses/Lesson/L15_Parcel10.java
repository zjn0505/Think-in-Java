package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Destination;

/**
 * Created by Jienan on 2016/10/26.
 */
// Using "instance initialization" to perform construction on an anonymous inner class.
public class L15_Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget!");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        L15_Parcel10 p = new L15_Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }

}
