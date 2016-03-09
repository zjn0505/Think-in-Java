//: operators/E11_SignedRightShift.java
/****************** Exercise 11 *****************
* Start with a number that has a binary one in
* the most significant position. (Hint: Use a
* hexadecimal constant.) Use the signed
* right-shift operator to right shift your
* number through all its binary positions.
* Display each result using Integer.toBinaryString().
************************************************/
package ch02_Operators;

public class E11_SignedRightShift {
	public static void main(String[] args){
		int i = 0x80000000;
		System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
		i >>= 1; System.out.println(Integer.toBinaryString(i));
        System.out.println("---------------------");
		i = -1;
		System.out.println(Integer.toBinaryString(i));
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i));
	}
}
