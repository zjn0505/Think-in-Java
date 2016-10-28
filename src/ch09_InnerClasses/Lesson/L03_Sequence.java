package ch09_InnerClasses.Lesson;

import ch09_InnerClasses.Selector;

/**
 * Created by Jienan on 2016/10/25.
 */

public class L03_Sequence {
    private Object[] items;
    private int next = 0;
    public L03_Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        L03_Sequence sequence = new L03_Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }

}
