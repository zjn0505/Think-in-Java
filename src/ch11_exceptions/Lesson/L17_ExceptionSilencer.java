package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/14.
 */
public class L17_ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
}
