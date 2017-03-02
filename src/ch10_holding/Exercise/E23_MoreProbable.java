package ch10_holding.Exercise;

/**
 * Created by Jienan on 2017/2/28.
 */

import java.util.*;

/****************** Exercise 23 *****************
 * Starting with Statistics.java, create a
 * program that runs the test repeatedly and
 * looks to see if any one number tends to appear
 * more than the others in the results.
 ***********************************************/

class Counter {
    int i = 1;
    public String toString() {
        return Integer.toString(i);
    }
}

class HistoUnit implements Comparable<HistoUnit> {

    Counter counter;
    Integer val;

    public HistoUnit(Counter counter, Integer val) {
        this.counter = counter;
        this.val = val;
    }

    @Override
    public int compareTo(HistoUnit o) {
        int lv = o.counter.i;
        int rv = counter.i;
        return (lv < rv ? -1 : (lv == rv ? 0 : 1));
    }

    @Override
    public String toString() {
        return "Value = " + val
                + ". Occurences = " + counter.i + "\n";
    }
}

public class E23_MoreProbable {
    private static Random rand = new Random(47);
    public static void main(String[] args) {
        Map<Integer, Counter> m =
                new HashMap<Integer, Counter>();
        for (int i = 0; i < 10000000; i++) {
            // Produce a number between 0 and 100;
            int r = rand.nextInt(100);
            if (m.containsKey(r))
                m.get(r).i++;
            else
                m.put(r, new Counter());
        }
        // Make a histogram:
        List<HistoUnit> lst = new ArrayList<HistoUnit>();
        Iterator<Map.Entry<Integer, Counter>> it =
                m.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Counter> entry = it.next();
            lst.add(new HistoUnit(
                    entry.getValue(), entry.getKey()
            ));
        }
        Collections.sort(lst);
        System.out.println("lst = " + lst);

    }
}
