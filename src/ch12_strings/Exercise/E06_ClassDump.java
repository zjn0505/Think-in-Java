package ch12_strings.Exercise;

/**
 * Created by Jienan on 2017/3/16.
 */

import java.util.Locale;

/****************** Exercise 6 ******************
 * Create a class that contains int, long, float
 * and double fields. Create a toString() method
 * for this class that uses String.format(), and
 * demonstrate that your class works correctly.
 ************************************************/
class DataHolder {
    int intField = 1;
    long longField = 2L;
    float floatField = 3.0f;
    double doubleField = 4.0;
    public String toString() {
        StringBuilder result =
                new StringBuilder("DataHolder: \n");
        result.append(String.format(Locale.US, "intField: %d\n", intField));
        result.append(String.format(Locale.US, "intField: %d\n", longField));
        result.append(String.format(Locale.US, "intField: %f\n", floatField));
        result.append(String.format(Locale.US, "intField: %e\n", doubleField));
        return result.toString();
    }
}
public class E06_ClassDump {
    public static void main(String[] args) {
        System.out.println(new DataHolder());
    }
}
