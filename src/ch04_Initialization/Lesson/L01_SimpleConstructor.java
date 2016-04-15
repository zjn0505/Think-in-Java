package ch04_Initialization.Lesson;

/**
 * Demonstration of a simple constructor
 * Created by Jienan on 2016/3/11.
 */
class Rock {
    Rock() {
        System.out.print("Rock ");
    }
}

public class L01_SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            new Rock();
    }
}
