//: operators/E14_CompareStrings.java
/****************** Exercise 14 *****************
* Write a method that compares two String arguments
* using all the Boolean comparisons and print the
* results. Perform the equals() test for the == and
* !=. In main(), call your method with different
* String objects.
************************************************/
package ch02_Operators;

public class E14_CompareStrings {
	public static void compareStrings(String a, String b){
		System.out.println("a == b: " + (a == b));
		System.out.println("a != b: " + (a != b));
		System.out.println("a.equals(b): " + a.equals(b));
	}
	
	public static void main(String[] args){
		String a = new String("Hello");
		String b = new String("Hi");
		String c = new String("Hello");
		compareStrings(a, b);
		compareStrings(a, c);
		compareStrings("Hello","Hello");
	}
}
