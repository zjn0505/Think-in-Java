package ch13_typeinfo.Lesson;

import net.mindview.util.Null;

import java.util.List;

/**
 * Created by Jienan on 2017/4/7.
 */
public interface L19_Robot {
    String name();
    String model();
    List<L19_Operation> operations();
    class Test {
        public static void test(L19_Robot r) {
            if (r instanceof Null)
                System.out.println("[Null Robot]");
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (L19_Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
