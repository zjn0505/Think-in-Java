package ch05_Access.Exercise;

import ch05_Access.Exercise.connection.E08_Connection;

/**
 * Created by Jienan on 2016/4/28.
 * Following the form of the example Lunch.java,
 * create a class called ConnectionManager that
 * manages a fixed array of Connection objects.
 * The client programmer must not be able to
 * create Connection objects, but only get them
 * via a static method in ConnectionManager.
 * ConnectionManager returns a null reference when
 * it runs out of objects. Test the classes in main().
 */
public class E08_ConnectionManagerDemo {
    public static void main(String[] args) {
        E08_Connection c = ch05_Access.Exercise.connection.E08_ConnectionManager.getConnection();
        while(null != c)
        {
            System.out.println(c);
            c.doSomething();
            c = ch05_Access.Exercise.connection.E08_ConnectionManager.getConnection();
        }
    }

}
