package ch14_generics.Lesson;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jienan on 2017/4/10.
 */
public class L04_RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        L04_RandomList<String> rs = new L04_RandomList<String>();
        for (String s : ("The quick brown fox jumped over the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");
    }
}
