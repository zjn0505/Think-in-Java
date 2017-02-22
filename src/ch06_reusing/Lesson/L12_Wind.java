package ch06_reusing.Lesson;

/**
 * Created by jienanzhang on 8/13/16.
 * Inheritance & upcasting
 */

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}

public class L12_Wind extends Instrument {
    public static void main(String[] args) {
        L12_Wind flute = new L12_Wind();
        Instrument.tune(flute); // Upcasting
    }
}
