package ch12_strings.Lesson;

import java.util.Scanner;

/**
 * Created by Jienan on 2017/3/24.
 */
public class L26_BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(L25_SimpleRead.input);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println(
                "How old are you? What is your favorite double?");
        System.out.println("(input: <age> <double>)");
        int age = stdin.nextInt();
        double favorite = stdin.nextDouble();
        System.out.format("Hi %s. \n", name);
        System.out.printf("In 5 years you will be %d \n", age + 5);
        System.out.printf("My favorite double is %f \n", favorite / 2);
    }
}
