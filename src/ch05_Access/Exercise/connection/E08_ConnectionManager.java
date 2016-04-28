package ch05_Access.Exercise.connection;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E08_ConnectionManager {
    private static E08_Connection[] pool = new E08_Connection[10];
    public static int counter = 0;
    static {
        for (int i = 0; i < pool.length; i++)
            pool[i] = new E08_Connection();
    }
    public static E08_Connection getConnection() {
        if (counter < pool.length)
            return pool[counter++];
        return null;
    }
}
