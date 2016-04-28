package ch05_Access.Exercise.local;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E05_Other {
    public E05_Other() {
        E05_AccessControl x = new E05_AccessControl();
        x.a = 1;
        x.b = 2;
        x.c = 3;
//        x.d = 4;
        x.f1();
        x.f2();
        x.f3();
//        x.f4();
    }
}
