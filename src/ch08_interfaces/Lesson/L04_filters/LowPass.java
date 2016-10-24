package ch08_interfaces.Lesson.L04_filters;

/**
 * Created by Jienan on 2016/10/13.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) { this.cutoff = cutoff; }
    public Waveform process(Waveform input) {
        return input;
    }
}
