//: object/E06_Storage.java
/****************** Exercise 6 ******************
* Write a program that includes and calls the
* storage() method defined as a code fragment in
* this chapter.
************************************************/
package ch01_Object;

public class E06_Storage {
	int storage(String s) {
		return s.length() * 2;
	}
	void print(String s){
		System.out.println("This string uses " + storage(s) + " bytes.");
	}
	public static void main(String[] args){
		String s = "Good Good Study, Day Day Up.";
		
		E06_Storage cE06 = new E06_Storage();
		cE06.print(s);
	}
}
