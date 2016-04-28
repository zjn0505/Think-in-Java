package ch05_Access.Exercise;

/**
 * Created by Jienan on 2016/4/28.
 */

class WithProtected {
    protected int i;
}
public class E06_ProtectedManipulation {
    public static void main(String[] args) {
        WithProtected x = new WithProtected();
        x.i = 1;
    }

}
