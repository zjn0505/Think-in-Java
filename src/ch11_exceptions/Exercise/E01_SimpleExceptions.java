package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/6.
 */
/****************** Exercise 1 ******************
 * Create a class with a main() that throws an
 * object of class Exception inside a try block.
 * Give the constructor for Exception a String
 * argument. Catch the exception inside a catch
 * clause and print the String argument. Add a
 * finally clause and print a message to prove
 * you were there.
 ***********************************************/
public class E01_SimpleExceptions {
    public static void main(String[] args) {
        try {
            throw new Exception("An exception in main");
        } catch (Exception e) {
            System.out.println(
                    "e.getMessage() = " + e.getMessage()
            );
        } finally {
            System.out.println("In finally clause");
        }
    }
}
