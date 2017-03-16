package ch12_strings.Lesson;

import java.util.Random;

/**
 * Created by Jienan on 2017/3/16.
 */
public class L04_UsingStringBuilder {
    public static Random rand = new Random(47);
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(rand.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return  result.toString();
    }

    public static void main(String[] args) {
        L04_UsingStringBuilder usb = new L04_UsingStringBuilder();
        System.out.println(usb);
    }
}
