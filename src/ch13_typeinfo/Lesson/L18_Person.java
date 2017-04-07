package ch13_typeinfo.Lesson;

import net.mindview.util.Null;

/**
 * Created by Jienan on 2017/4/7.
 */
public class L18_Person {
    public final String first;
    public final String last;
    public final String address;
    // etc
    public L18_Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    public static class NullPerson extends L18_Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }
        public String toString() { return "NullPerson"; }
    }

    public static final L18_Person NULL = new NullPerson();

}
