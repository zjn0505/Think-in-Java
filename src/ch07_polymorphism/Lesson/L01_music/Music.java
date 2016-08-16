package ch07_polymorphism.Lesson.L01_music;

/**
 * Created by Jienan on 2016/8/16.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
