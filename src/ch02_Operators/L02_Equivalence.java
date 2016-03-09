package ch02_Operators;

/**
 * Demonstrate == & !=
 * Created by Jienan on 2016/3/9.
 */
public class L02_Equivalence {
    public static void main(String[] args) {
        int n1 = 47;
        int n2 = 47;
        System.out.println(n1 == n2);

        Integer n3 = new Integer(47);
        Integer n4 = new Integer(47);
        System.out.println(n3 == n4);

    }
}
