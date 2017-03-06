package ch11_exceptions.Exercise;

/**
 * Created by Jienan on 2017/3/6.
 */
/****************** Exercise 2 ******************
 * Define an object reference and initialize it
 * to null. Try to call a method through this
 * reference. Now wrap the code in a try-catch
 * clause to catch the exception.
 ***********************************************/
public class E02_NullReference {
    public static void main(String[] args) {
        String s = null;
        // Causes a NullPointerException:
        //! s.toString();
        try {
            s.toString();
        } catch (Exception e) {
            System.out.println("Caught exception " + e);
        }
    }
}
