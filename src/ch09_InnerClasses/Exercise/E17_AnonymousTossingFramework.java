package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/11/11.
 */
interface Tossing { boolean event(); }

interface TossingFactory { Tossing getTossing(); }

class CoinTossing implements Tossing {
    private int events;
    private static final int EVENTS = 2;
    public boolean event() {
        System.out.println("Coin tossing event " + events);
        return ++events != EVENTS;
    }
    public static TossingFactory factory = new TossingFactory() {
        @Override
        public Tossing getTossing() {
            return new CoinTossing();
        }
    };
}

class DiceTossing implements Tossing {
    private int events;
    private static final int EVENTS = 6;
    public boolean event() {
        System.out.println("Dice tossing event " + events);
        return ++events != EVENTS;
    }
    public static TossingFactory factory = new TossingFactory() {
        public Tossing getTossing() {
            return new DiceTossing();
        }
    };
}

public class E17_AnonymousTossingFramework {
    public static void simulate(TossingFactory fact) {
        Tossing t = fact.getTossing();
        while (t.event()) {
            ;
        }
    }

    public static void main(String[] args) {
        simulate(CoinTossing.factory);
        simulate(DiceTossing.factory);
    }
}
