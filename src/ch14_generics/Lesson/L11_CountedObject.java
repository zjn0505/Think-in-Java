package ch14_generics.Lesson;

/**
 * Created by Jienan on 2017/4/24.
 */
public class L11_CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id() { return id; }
    public String toString() { return "CountedObject " + id; }
}
