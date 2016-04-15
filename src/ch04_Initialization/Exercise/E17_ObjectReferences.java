package ch04_Initialization.Exercise;

/**
 * Create a class with a constructor that takes
 * a String argument. During construction, print
 * the argument. Create an array of object
 * references to this class, but don't
 * create objects to assign into the
 * array. When you run the program, notice
 * whether the initialization messages from the
 * constructor calls are printed.
 * Created by Jienan on 2016/3/31.
 */
public class E17_ObjectReferences {
    Test[] array1 = new Test[5];
    public static void main(String[] args) {
        Test[] array2 = new Test[5];
    }
}

class Test {
    Test (String s) {
        System.out.println("String constructor: s = " + s);
    }
}
