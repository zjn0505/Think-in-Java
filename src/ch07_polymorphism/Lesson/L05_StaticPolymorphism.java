package ch07_polymorphism.Lesson;

/**
 * Created by Jienan on 2016/8/30.
 */

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends  StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}
public class L05_StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
