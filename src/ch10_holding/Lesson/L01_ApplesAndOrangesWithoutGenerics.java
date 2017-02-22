package ch10_holding.Lesson;

import java.util.ArrayList;

/**
 * Created by Jienan on 2017/2/22.
 */
// Simple container example (produces compiler warnings).
// {ThrowsException}
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {}

public class L01_ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Not prevented from adding an Orange to apples;
        apples.add(new Orange());
        for(int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();
            // Orange is detected only at run time
    }
}
