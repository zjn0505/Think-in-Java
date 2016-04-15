package ch04_Initialization.Lesson;

/**
 * Constructors can have arguments
 * Created by Jienan on 2016/3/11.
 */
class Rock2 {
    Rock2(int i) {
        System.out.print("Rock " + i + " ");
    }
}

public class L02_SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
            new Rock2(i);
    }
}
