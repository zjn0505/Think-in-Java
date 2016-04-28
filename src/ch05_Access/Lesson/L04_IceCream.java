package ch05_Access.Lesson;

/**
 * Created by Jienan on 2016/4/28.
 * Demonstrates "private" keyword.
 */
class L04_Sundae {
    private L04_Sundae() {

    }
    static L04_Sundae makeASundae() {
        return new L04_Sundae();
    }
}

public class L04_IceCream {
    public static void main(String[] args) {
//        L04_Sundae x = new L04_Sundae();
        L04_Sundae x = L04_Sundae.makeASundae();
    }
}
