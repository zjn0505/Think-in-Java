package ch08_interfaces.Lesson.L05_interfaceprocessor;

/**
 * Created by Jienan on 2016/10/14.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
}
