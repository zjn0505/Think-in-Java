package ch11_exceptions.Lesson;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Jienan on 2017/3/6.
 */

// Logging caught exceptions.
public class L04_LoggingException2 {
    private static Logger logger =
            Logger.getLogger("LoggingException");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
