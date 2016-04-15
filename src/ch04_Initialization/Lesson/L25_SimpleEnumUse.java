package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/4/15.
 */

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class L25_SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);
    }
}
