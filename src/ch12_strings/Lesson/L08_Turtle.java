package ch12_strings.Lesson;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by Jienan on 2017/3/16.
 */
public class L08_Turtle {
    private String name;
    private Formatter f;
    public L08_Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        L08_Turtle tommy = new L08_Turtle("Tommy", new Formatter(System.out));
        L08_Turtle terry = new L08_Turtle("Terry", new Formatter(outAlias));
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
