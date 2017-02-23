package ch10_holding.Exercise;

import ch09_InnerClasses.Selector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jienan on 2017/2/23.
 */

/****************** Exercise 3 ******************
 * Modify innerclasses/Sequence.java so you
 * can add any number of elements to it.
 ***********************************************/

class UnlimitedSequence {
    private final List<Object> items =
            new ArrayList<Object>();
    private int next = 0;

    public void add(Object x) {
        items.add(x);
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if (i < items.size())
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
public class E03_UnlimitedSequence {
    public static void main(String[] args) {
        UnlimitedSequence sequence = new UnlimitedSequence();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + ", ");
            selector.next();
        }
    }
}
