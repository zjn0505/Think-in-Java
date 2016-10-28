package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Contents;

/**
 * Created by Jienan on 2016/10/26.
 */
// Returning an instance of an anonymous inner class.
public class L10_Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        }; // Semicolon required in this case
    }

    public static void main(String[] args) {
        L10_Parcel7 p = new L10_Parcel7();
        Contents c = p.contents();
        c.value();
    }
}
