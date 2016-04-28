package ch05_Access.Lesson;

import ch05_Access.Lesson.dessert.L06_Cookie;

/**
 * Created by Jienan on 2016/4/28.
 */
public class L06_ChocolateChip extends L06_Cookie {
    public L06_ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        L06_ChocolateChip x = new L06_ChocolateChip();
        x.chomp();
    }
}
