package ch11_exceptions.Lesson;

import java.io.FileInputStream;

/**
 * Created by Jienan on 2017/3/15.
 */
public class L23_MainException {
    // Pass all exceptions to the console:
    public static void main(String[] args) throws Exception {
        // Open the file:
        FileInputStream file = new FileInputStream("src\\ch11_exceptions\\Lesson\\L23_MainException.java");
        // Use the file ...
        // Close the file:
        file.close();
    }
}
