package ch14_generics.Lesson.L05_coffee;

/**
 * Created by Jienan on 2017/4/11.
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
