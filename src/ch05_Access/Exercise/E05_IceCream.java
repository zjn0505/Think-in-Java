package ch05_Access.Exercise;

/**
 * Created by Jienan on 2016/4/28.
 * Demonstrates "private" keyword.
 */
class E05_Sundae {
    private E05_Sundae() {

    }
    static E05_Sundae makeASundae() {
        return new E05_Sundae();
    }
}

public class E05_IceCream {
    public static void main(String[] args) {
//        E05_Sundae x = new E05_Sundae();
        E05_Sundae x = E05_Sundae.makeASundae();
    }
}
