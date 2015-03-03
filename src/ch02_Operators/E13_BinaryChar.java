//: operators/E13_BinaryChar.java
/****************** Exercise 13 *****************
* Write a method to display char values in
* binary form. Demonstrate it using several
* different characters.
************************************************/
package ch02_Operators;

public class E13_BinaryChar {
	static void charToBinary(char c){
		System.out.println(c + ": " + Integer.toBinaryString(c));
	}
	public static void main(String[] args){
		charToBinary('A');
		charToBinary('!');
		charToBinary('x');
		charToBinary('7');
	}
}
