package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/24.
 */
// Creating inner classes.
public class L01_Parcel1 {
    class Contents {
        private int i = 11;
        public int value() { return i; }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabed() { return label; }
    }
    // Using inner classes looks just like
    // using any other class, within Parcel1;
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabed());
    }

    public static void main(String[] args) {
        L01_Parcel1 p = new L01_Parcel1();
        p.ship("Tasmania");
    }
}
