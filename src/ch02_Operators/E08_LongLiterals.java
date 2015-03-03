//: operators/E08_LongLiterals.java
/****************** Exercise 8 *****************
* Show that hex and octal notations work with long
* values. Use Long.toBinaryString() to display
* the results.
***********************************************/
package ch02_Operators;

public class E08_LongLiterals {
	public static void main(String[] args){
		long l1 = 0x2f; // Hexadecimal (lowercase)
		System.out.println("l1: " + Long.toBinaryString(l1));
		long l2 = 0X2F; // Hexadecimal (uppercase)
		System.out.println("l2: " + Long.toBinaryString(l2));
		long l3 = 0177; // Octal (leading zero)
		System.out.println("l3: " + Long.toBinaryString(l3));
		char c = 0xffff; // max char hex value
		System.out.println("c: " + Long.toBinaryString(c));
		byte b = 0x7f; // max byte hex value
		System.out.println("b: " + Long.toBinaryString(b));
		short s = 0x7fff; // max short hex value
		System.out.println("s: " + Long.toBinaryString(s));
		long n1 = 200L; // long suffix
		long n2 = 200l; // long suffix (but can be confusing)
		long n3 = 200;
		float f1 = 1;
		float f2 = 1F; // float suffix
		float f3 = 1f; // float suffix
		double d1 = 1d; // double suffix
		double d2 = 1D; // double suffix
		// (Hex and Octal also work with long)
	}
	
}
