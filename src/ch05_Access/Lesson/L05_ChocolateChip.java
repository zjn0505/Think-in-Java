package ch05_Access.Lesson;

import ch05_Access.Lesson.dessert.L03_Cookie;

/**
 * Created by Jienan on 2016/4/28.
 * Can't use package-access member from another package.
 */
public class L05_ChocolateChip extends L03_Cookie {
    public L05_ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //! bite(); // Can't access bite
    }

    public static void main(String[] args) {
        L05_ChocolateChip x = new L05_ChocolateChip();
        x.chomp();
    }
}
