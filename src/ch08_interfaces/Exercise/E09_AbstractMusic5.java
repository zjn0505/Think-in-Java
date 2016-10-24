package ch08_interfaces.Exercise;

/**
 * Created by Jienan on 2016/10/13.
 */

import ch07_polymorphism.Lesson.L01_music.Note;

/****************** Exercise 9 ******************
 * Refactor Music5.java by moving the common
 * methods in Wind, Percussion and Stringed into
 * an abstract class.
 ***********************************************/

abstract class Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public abstract String toString();
}

class Wind extends Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class E09_AbstractMusic5 {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
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
