package ch12_strings.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jienan on 2017/3/16.
 */
public class L06_InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<L06_InfiniteRecursion> v = new ArrayList<L06_InfiniteRecursion>();
        for (int i = 0; i < 10; i++)
            v.add(new L06_InfiniteRecursion());
        System.out.println(v);
    }
}
