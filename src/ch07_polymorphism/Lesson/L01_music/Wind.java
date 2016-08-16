package ch07_polymorphism.Lesson.L01_music;

/**
 * Created by Jienan on 2016/8/16.
 */
public class Wind extends Instrument{
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
