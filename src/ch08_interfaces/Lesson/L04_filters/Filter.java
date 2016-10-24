package ch08_interfaces.Lesson.L04_filters;

/**
 * Created by Jienan on 2016/10/13.
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) { return input; }
}
