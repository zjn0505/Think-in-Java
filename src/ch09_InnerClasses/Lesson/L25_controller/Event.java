package ch09_InnerClasses.Lesson.L25_controller;

/**
 * Created by jienanzhang on 12/1/16.
 */
// The common method for any control event
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();
}
