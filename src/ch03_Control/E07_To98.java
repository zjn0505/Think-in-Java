//: control/E07_To98.java
/****************** Exercise 7 ******************
* Modify Exercise 1 so the program exits by
* using the break keyword at value 99. Try using
* return instead.
************************************************/
package ch03_Control;

public class E07_To98 {
	public static void main(String[] args){
		for (int i = 0; i < 100; i++) {
			if (i == 99) return;
			System.out.print(i + " ");
		}
	}
}