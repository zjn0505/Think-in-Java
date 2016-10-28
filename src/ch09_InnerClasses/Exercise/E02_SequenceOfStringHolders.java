package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/25.
 */

import ch09_InnerClasses.Lesson.L03_Sequence;
import ch09_InnerClasses.Selector;

/****************** Exercise 2 *****************
 * Create a class that holds a String, with a
 * toString() method that displays this String.
 * Add several instances of your new class to a
 * Sequence object, then display them.
 ***********************************************/

class StringHolder {
    private String data;
    StringHolder(String data) { this.data = data; }
    public String toString() { return data; }
}

public class E02_SequenceOfStringHolders {
    public static void main(String[] args) {
        L03_Sequence sequence = new L03_Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(new StringHolder(Integer.toString(i)));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
