package ch05_Access.Exercise;

import ch05_Access.Exercise.connection2.E08_Connection;
import ch05_Access.Exercise.connection2.E08_ConnectionManager;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E08_ConnectionManagerDemo2 {
    public static void main(String[] args) {
        E08_Connection[] ca = new E08_Connection[10];
        for (int i = 0; i < 10; i++)
            ca[i] = E08_ConnectionManager.getConnection();
        System.out.println(E08_ConnectionManager.getConnection());
        for (int i = 0; i < 5; i++) {
            ca[i].checkIn();
            E08_Connection c = E08_ConnectionManager.getConnection();
            System.out.println(c);
            c.doSomething();
            c.checkIn();
        }
    }
}
