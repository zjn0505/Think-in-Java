package ch07_polymorphism.Exercise;

import java.util.Random;

/**
 * Created by Jienan on 2016/8/22.
 */

class InstrumentGenerator2 {
    Random gen = new Random(47);
    Class<?> instruments[] = {
        Wind.class,
        Percussion.class,
        Stringed.class,
        Brass.class,
        Woodwind.class,
        Electronic.class
    };

    public Instrument next() {
        try {
            int idx = Math.abs(gen.nextInt(instruments.length));
            return (Instrument) instruments[idx].newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot Create", e);
        }
    }
}

public class E08_RandomInstruments2 {
    public static void main(String[] args) {
        InstrumentGenerator2 gen = new InstrumentGenerator2();
        for (int i = 0; i < 20; i++)
            System.out.println(gen.next());
    }
}
