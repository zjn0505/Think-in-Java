//: initialization/E04_OverloadedConstructor.java
/****************** Exercise 4 *****************
* Add an overloaded constructor to Exercise 3 that
* takes a String argument and prints it along with
* your message.
***********************************************/
package ch04_Initialization.Exercise;

public class E04_OverloadedConstructor {
	E04_OverloadedConstructor() {
		System.out.println("Default Constructor");
	}
	E04_OverloadedConstructor(String s){
		System.out.println("Overload Constructor " + s);
	}
	public static void main(String[] args){
		E04_OverloadedConstructor oc1 = new E04_OverloadedConstructor();
		E04_OverloadedConstructor oc2 = new E04_OverloadedConstructor("is this");
		
		
	}
}
