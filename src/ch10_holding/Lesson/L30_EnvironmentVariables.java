package ch10_holding.Lesson;

import java.util.Map;

/**
 * Created by jienanzhang on 05/03/2017.
 */
public class L30_EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                entry.getValue());
        }
    }
}
