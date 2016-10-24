package ch08_interfaces.Lesson.L04_filters;

/**
 * Created by Jienan on 2016/10/13.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Waveform " + id;}
}
