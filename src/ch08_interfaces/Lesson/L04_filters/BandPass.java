package ch08_interfaces.Lesson.L04_filters;

/**
 * Created by Jienan on 2016/10/13.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowcut, double highcut) {
        lowCutoff = lowcut;
        highCutoff = highcut;
    }
    public Waveform process(Waveform input) { return input; }
}
