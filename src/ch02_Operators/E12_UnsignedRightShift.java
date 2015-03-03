//: operators/E12_UnsignedRightShift.java
/****************** Exercise 12 *****************
* Start with a number that is all binary ones.
* Left shift it, then use the unsigned right-shift
* operator to right shift through all of its binary
* positions. Display each result using
* Integer.toBinaryString().
************************************************/
package ch02_Operators;

public class E12_UnsignedRightShift {
	public static void main(String[] args){
		int i = 0xffffffff;
		int j = -1;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(j));
		i <<= 1;
		System.out.println(Integer.toBinaryString(i));
		j <<= 1;
		System.out.println(Integer.toBinaryString(j));
		
		for (int m = 0; m < 31; m++) {
			i >>>= 1; System.out.println(Integer.toBinaryString(i));
		}
		for (int m = 0; m < 31; m++) {
			j >>>= 1; System.out.println(Integer.toBinaryString(j));
		}
	}
	
}
