package ch12_strings.Lesson;

/**
 * Created by Jienan on 2017/3/16.
 */
public class L11_DatabaseException extends Exception {
    public L11_DatabaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new L11_DatabaseException(3, 7, "Write failed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
