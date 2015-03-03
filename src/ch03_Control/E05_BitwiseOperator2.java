//: control/E05_BitwiseOperators2.java
/****************** Exercise 5 ******************
* Repeat Exercise 10 from the previous chapter,
* but use the ternary operator and a bitwise test
* instead of Integer.toBinaryString() to display
* the ones and zeroes.
************************************************/
package ch03_Control;

public class E05_BitwiseOperator2 {
	private static void toBinaryString(int i){
		char[] buffer = new char[32];
		int bufferPosition = 32;
		do{
			buffer[--bufferPosition] = ((i & 0x01) != 0) ? '1' : '0';
			i >>>= 1;
		}while(i != 0);
		
		for(int j = bufferPosition; j < 32; j++)
			System.out.print(buffer[j]);
		System.out.println("");
	}
	public static void main(String[] args){
		int i1 = 0xaaaaaaaa;
		int i2 = 0x55555555;
		System.out.print("i1 = "); toBinaryString(i1);
		System.out.print("i2 = "); toBinaryString(i2);
		System.out.print("~i1 = "); toBinaryString(~i1);
		System.out.print("~i2 = "); Integer.toBinaryString(~i2);
		System.out.print("i1 & i2 = "); toBinaryString(i1 & i2);
		System.out.print("i1 | i2 = "); toBinaryString(i1 | i2);
		System.out.print("i1 ^ i2 = "); toBinaryString(i1 ^ i2);
		System.out.print("i1 & i1 = "); toBinaryString(i1 & i1);
		System.out.print("i1 | i1 = "); toBinaryString(i1 | i1);
		System.out.print("i1 ^ i1 = "); toBinaryString(i1 ^ i1);
	}
}
