package ch08_interfaces.Lesson.L02_music;

import ch07_polymorphism.Lesson.L01_music.Note;

/**
 * Created by Jienan on 2016/10/13.
 */

interface Instrument {
    // Compile-time constant;
    int VALUE = 5; // static & final
    // Cannot have method definitions;
    void play(Note n); // Automatically public
    void adjust();
}
class Wind implements Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion implements Instrument {
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed implements Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    public String toString() {
        return "Woodwind";
    }
}
public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
    }
}
