package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/8/30.
 */

class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    public int getField() {
        return field;
    }
    public int getSuperField() {
        return super.field;
    }
}
public class L04_FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field +
        ", sup.getFiled() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
        sub.field + ", sub.getField() = " +
        sub.getField() +
        ", sub.getSuperField() = " +
        sub.getSuperField());
    }
}
