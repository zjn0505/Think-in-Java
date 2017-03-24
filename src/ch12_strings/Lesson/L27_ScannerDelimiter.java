package ch12_strings.Lesson;

import java.util.Scanner;

/**
 * Created by Jienan on 2017/3/24.
 */
public class L27_ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while (scanner.hasNext())
            System.out.println(scanner.nextInt());
    }
}
