package ch13_typeinfo.Lesson;

/**
 * Created by jienanzhang on 31/03/2017.
 */
public class L06_WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
