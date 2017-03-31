package ch13_typeinfo.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jienanzhang on 31/03/2017.
 */
class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString() { return Long.toString(id); }
}

public class L08_FilledList<T> {
    private Class<T> type;
    public L08_FilledList(Class<T> type) { this.type = type; }
    public List<T> create(int nElements) {
        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++)
                result.add(type.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        L08_FilledList<CountedInteger> fl =
            new L08_FilledList<CountedInteger>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}









