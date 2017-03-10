package ch11_exceptions.Lesson;

/**
 * Created by jienanzhang on 10/03/2017.
 */
// Demonstrating the Exception Methods
public class L06_ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("toString(): " + e.toString());
            System.out.println("printStackTrace()");
            e.printStackTrace();
        }
    }
}
