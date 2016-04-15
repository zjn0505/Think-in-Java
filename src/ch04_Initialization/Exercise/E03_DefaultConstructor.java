//: initialization/E03_DefaultConstructor.java
/****************** Exercise 3 ******************
* Create a class with a default constructor (one
* that takes no arguments) that prints a
* message. Create an object of this class.
************************************************/
package ch04_Initialization.Exercise;

public class E03_DefaultConstructor {
	E03_DefaultConstructor() {
		System.out.println("Default constructor");
	}
	public static void main(String[] args){
		E03_DefaultConstructor dc = new E03_DefaultConstructor();
	}
}
