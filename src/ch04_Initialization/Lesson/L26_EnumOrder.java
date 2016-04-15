package ch04_Initialization.Lesson;

/**
 * Created by Jienan on 2016/4/15.
 */
public class L26_EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
