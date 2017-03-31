package ch12_strings.Exercise;

/**
 * Created by Jienan on 2017/3/24.
 */

import java.util.Locale;
import java.util.Scanner;

/********************** Exercise 20 *********************
 * Create a class that contains int, long, float and double
 * and String fields. Create a constructor for this class
 * that takes a single String argument, and scans that
 * string into the various fields. Add a toString() method
 * and demonstrate that your class works correctly.
 ********************************************************/
class DataHolder2 {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;
    DataHolder2(String data) {
        Scanner stdin = new Scanner(data);
        stdin.useLocale(Locale.US);
        i = stdin.nextInt();
        l = stdin.nextLong();
        f = stdin.nextFloat();
        d = stdin.nextDouble();
        s = stdin.next("\\w+");
    }
    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s;
    }
}
public class E20_Scanner {
    public static void main(String[] args) {
        DataHolder2 dh = new DataHolder2("1 10000000000000 1.1 1e55 Howdy Hi");
        System.out.println(dh);
    }
}