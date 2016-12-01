package ch09_InnerClasses.Exercise;

import ch09_InnerClasses.Selector;

/**
 * Created by Jienan on 2016/11/14.
 */
class Sequence3 {
    private Object[] items;
    private int next = 0;
    public Sequence3(int size) {
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

    private class ReverseSelector implements Selector {
        private int i = items.length - 1;
        @Override
        public boolean end() {
            return i < 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i >= 0) i--;
        }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public Selector reverseSelector() {
        return new ReverseSelector();
    }
}
public class E22_GetRSelector {
    public static void main(String[] args) {
        Sequence3 sequence = new Sequence3(10);
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
