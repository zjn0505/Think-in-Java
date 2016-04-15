package ch04_Initialization.Exercise;

/**
 * Created by Jienan on 2016/3/31.
 */
public class E18_ObjectArray {
    public static void main(String[] args) {
        Test[] array = new Test[5];
        for (int i = 0; i < array.length; i++)
            array[i] = new Test(Integer.toString(i));
    }
}
