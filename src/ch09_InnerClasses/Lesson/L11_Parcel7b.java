package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Contents;

/**
 * Created by Jienan on 2016/10/26.
 */
// Expanded version of Parcel7

public class L11_Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    public Contents contents() { return new MyContents(); }

    public static void main(String[] args) {
        L11_Parcel7b p = new L11_Parcel7b();
        Contents c = p.contents();
    }
}
