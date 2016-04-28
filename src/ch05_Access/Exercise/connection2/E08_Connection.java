package ch05_Access.Exercise.connection2;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E08_Connection {
    private static int counter = 0;
    private int id = counter++;
    E08_Connection() {}
    public String toString() {
        return "Connection " + id;
    }
    public void doSomething() {}
    public void checkIn() {
        E08_ConnectionManager.checkIn(this);
    }
}
