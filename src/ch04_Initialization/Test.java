package ch04_Initialization;
class Book {
	boolean checkedOut = false;
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	protected void finalize() {
		if(checkedOut)
			System.out.println("Error: checked out");
			// Normally, you’ll also do this:
			// super.finalize(); // Call the base-class version
		}
	}
	public class Test {
		public static void main(String[] args) {
			Book novel = new Book(true);
			// Proper cleanup:
			novel.checkIn();
			// Drop the reference, forget to clean up:
			Book fiction = new Book(true);
			new Book(true);
			// Force garbage collection & finalization:
			System.gc();
		}
}
