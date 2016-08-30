package ch07_polymorphism.Exercise;

import ch07_polymorphism.Lesson.L01_music.Note;

/**
 * Created by Jienan on 2016/8/22.
 */
class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    @Override
    public String toString() {
        return "Instrument";
    }
    void adjust() {}
}

class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class E06_MusicToString {
    static Instrument[] orchestra = {
        new Wind(),
        new Percussion(),
        new Stringed(),
        new Brass(),
        new Woodwind()
    };
    public static void printAll(Instrument[] orch) {
        for (Instrument i : orch)
            System.out.println(i);
    }

    public static void main(String[] args) {
        printAll(orchestra);
    }
}
