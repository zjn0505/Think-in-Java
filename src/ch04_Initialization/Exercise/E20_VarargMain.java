package ch04_Initialization.Exercise;

/**
 * Created by Jienan on 2016/4/15.
 * Create a main() that uses varargs instead
 * of the ordinary main() syntax. Print all the
 * elements in the resulting args array. Test it
 * with various numbers of command-line
 * arguments.
 */
public class E20_VarargMain {
    public static void main(String[] args) {
        E19_VarargStringArray.printStrings(args);
    }
}
