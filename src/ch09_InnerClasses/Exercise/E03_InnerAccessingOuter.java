package ch09_InnerClasses.Exercise;

/**
 * Created by Jienan on 2016/10/25.
 */
/****************** Exercise 3 *****************
 * Modify Exercise 1 so Outer has a private
 * String field (initialized by the constructor),
 * and Inner has a toString() that displays this
 * field. Create an object of type Inner and
 * display it.
 ***********************************************/

class Outer2 {
    private final String data;
    class Inner {
        public String toString() { return data; }
    }
    Outer2(String data) { this.data = data; }
    Inner getInner() { return new Inner(); }
}
public class E03_InnerAccessingOuter {
    public static void main(String[] args) {
        Outer2 o = new Outer2("Inner access outer!");
        Outer2.Inner i = o.getInner();
        System.out.println(i.toString());
    }
}
