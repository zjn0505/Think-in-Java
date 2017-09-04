package ch14_generics.Lesson;

/**
 * Created by jienanzhang on 01/05/2017.
 */
public class L18_Manipulator3 {
    private L18_HasF obj;
    public L18_Manipulator3(L18_HasF x) { obj = x; }
    public void manipulate() { obj.f(); }
}

// This is same as Manipulator2