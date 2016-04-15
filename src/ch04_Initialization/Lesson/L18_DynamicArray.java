package ch04_Initialization.Lesson;

/**
 * Array initialization
 * Created by Jienan on 2016/3/31.
 */
public class L18_DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle", "de", "dum"});
    }

}

class Other {
    public static void main(String[] args) {
        for(String s: args)
            System.out.print(s + "");
    }
}