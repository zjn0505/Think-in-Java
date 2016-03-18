package ch04_Initialization;

/**
 * Using finalize() to detect an object that
 * hasn't been properly cleaned up
 * Created by Jienan on 2016/3/16.
 */
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void  checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if(checkedOut)
            System.out.println("Error: checked out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version.
        // Assume the base class will do something as well.
    }
}

public class L09_TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference. forget to clean up:
        new Book(true);
        // Force garbage collection & finalization:
        System.gc();
    }

}
