package ch06_reusing.Lesson;

/**
 * Created by Jienan on 2016/4/28.
 * Composition for code reuse.
 */
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString() { return s; }
}

public class L01_SprinklerSystem {
    private String valve1, valve2, valve3, valve4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
                "valve1 = " + valve1 + " " +
                "valve2 = " + valve2 + " " +
                "valve3 = " + valve3 + " " +
                "valve4 = " + valve4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        L01_SprinklerSystem sprinklers = new L01_SprinklerSystem();
        System.out.println(sprinklers);
    }

}
