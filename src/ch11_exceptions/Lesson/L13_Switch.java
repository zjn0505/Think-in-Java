package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/13.
 */
public class L13_Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}


