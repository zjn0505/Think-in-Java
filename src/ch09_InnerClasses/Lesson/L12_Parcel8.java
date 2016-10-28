package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/26.
 */
// Calling the base-class constructor.

public class L12_Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        L12_Parcel8 p = new L12_Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
