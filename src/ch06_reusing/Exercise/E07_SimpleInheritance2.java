package ch06_reusing.Exercise;

/**
 * Created by jienanzhang on 6/25/16.
 */
/****************** Exercise 7 ******************
 * Modify Exercise 5 so A and B have
 * constructors with arguments instead of default
 * constructors. Write a constructor for C and
 * perform all initialization within it.
 ***********************************************/

class A2 {
    A2(String s) {
        System.out.println("A2() " + s);
    }
}

class B2 {
    B2(String s) {
        System.out.println("B2() " + s);
    }
}

class C2 extends A2 {
    C2(String s) {
        super(s);
        System.out.println("C2() " + s);
    }
}

public class E07_SimpleInheritance2 {
    public static void main(String[] args) {
        new C2("Init String");
    }
}
