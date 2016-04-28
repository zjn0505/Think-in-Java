package ch05_Access.Exercise.local;

/**
 * Created by Jienan on 2016/4/28.
 */
public class E05_AccessControl {
    public int a;
    protected int b;
    int c;
    private int d;
    public void f1() {}
    protected void f2() {}
    void f3() {}
    private void f4() {}

    public static void main(String[] args) {
        E05_AccessControl x = new E05_AccessControl();
        x.a = 1;
        x.b = 2;
        x.c = 3;
        x.d = 4;
        x.f1();
        x.f2();
        x.f3();
        x.f4();
    }
}
