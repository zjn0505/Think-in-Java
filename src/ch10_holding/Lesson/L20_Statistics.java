package ch10_holding.Lesson;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Jienan on 2017/2/27.
 */
// Simple demostration of HashMap
// Statistics for the Random() products
public class L20_Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer,Integer>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
