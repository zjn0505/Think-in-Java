package ch09_InnerClasses.Lesson;

import javax.swing.text.AbstractDocument;

/**
 * Created by Jienan on 2016/10/25.
 */
public class L02_Parcel2 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() { return label; }
    }
    public Destination to(String s) {
        return new Destination(s);
    }
    public Contents contents() {
        return new Contents();
    }
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        L02_Parcel2 p = new L02_Parcel2();
        p.ship("Tasmania");
        L02_Parcel2 q = new L02_Parcel2();
        L02_Parcel2.Contents c = q.contents();
        L02_Parcel2.Destination d = q.to("Borneo");
    }
}
