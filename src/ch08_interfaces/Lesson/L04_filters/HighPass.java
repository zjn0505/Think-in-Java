package ch08_interfaces.Lesson.L04_filters;

/**
 * Created by Jienan on 2016/10/13.
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) { return input; }
}
