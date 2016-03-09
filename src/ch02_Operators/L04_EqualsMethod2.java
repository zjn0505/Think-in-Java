package ch02_Operators;

/**
 * Demonstrate .equals() methond for self-defined class
 * Created by Jienan on 2016/3/9.
 */
class Value{
    int i;
}


public class L04_EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1.i == v2.i);
    }
}
