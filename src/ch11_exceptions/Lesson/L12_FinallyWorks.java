package ch11_exceptions.Lesson;

/**
 * Created by Jienan on 2017/3/13.
 */
// The finally clause is always executed.

class ThreeException extends Exception {}

public class L12_FinallyWorks {
    static int count = 0;
    public static void main(String[] args) {
        while (true) {
            try {
                // Post-increment is zero first time:
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No exception");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In finally clause");
                if (count == 2)
                    break;
            }
        }
    }
}

