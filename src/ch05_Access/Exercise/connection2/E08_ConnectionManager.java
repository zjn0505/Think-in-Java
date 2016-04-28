package ch05_Access.Exercise.connection2;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E08_ConnectionManager {
    private static E08_Connection[] pool = new E08_Connection[10];
    static {
        for (int i = 0; i < pool.length; i++)
            pool[i] = new E08_Connection();
    }
    public static E08_Connection getConnection() {
        for(int i = 0; i < pool.length; i++) {
            if (pool[i] != null) {
                E08_Connection c = pool[i];
                pool[i] = null; // Indicates "in use"
                return c;
            }
        }
        return null;
    }
    public static void checkIn(E08_Connection c) {
        for (int i = 0; i < pool.length; i++)
            if (pool[i] == null) {
                pool[i] = c;
                return;
            }
    }
}
