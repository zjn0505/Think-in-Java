package ch03_Control;

/**
 * Created by Jienan on 2016/3/10.
 */
public class L01_ForEachString {
    public static void main(String[] args) {
        for (char c : "An African Swallow".toCharArray())
            System.out.print(c + " ");
    }
}
