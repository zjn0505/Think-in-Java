package ch09_InnerClasses.Lesson;

/**
 * Created by Jienan on 2016/10/25.
 */
// Creating an inner class directly using the .new syntax.
public class L05_DotNew {
    public class Inner {}

    public static void main(String[] args) {
        L05_DotNew dn = new L05_DotNew();
        Inner dni = dn.new Inner();
    }
}
