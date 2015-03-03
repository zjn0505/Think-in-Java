//: object/E09_AutoboxingTest.java
/****************** Exercise 9 ******************
* Write a program to demonstrate that
* autoboxing works for all the primitive types
* and their wrappers.
************************************************/
package ch01_Object;

public class E09_AutoboxingTest {
	public static void main(String[] args){
		Boolean bo = true;
		boolean b = bo;
		System.out.println("boolean = " + b);
		
		Byte by = -128;
		byte bt = by;
		System.out.println("byte = " + bt);
		
		Character ch = 'x';
		char c = ch;
		System.out.println("char = " + c);
		
		Short sh = 1;
		short s = sh;
		System.out.println("short = " + s);
		
		Long lo = 1L;
		long l = lo;
		System.out.println("long = " + l);
		
		Integer in = 1;
		int i = in;
		System.out.println("int = " + i);
		
		Float fl = 1.0f;
		float f = fl;
		System.out.println("float = " + f);
		
		Double db = 1.0d;
		double d = db;
		System.out.println("double = " + d);
	}
}
