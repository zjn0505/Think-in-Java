package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 01/05/2017.
 */
public class L18_Manipulator2<T extends L18_HasF> {
    private T obj;
    public L18_Manipulator2(T x) { obj = x; }
    public void manipulate() { obj.f(); }
}
