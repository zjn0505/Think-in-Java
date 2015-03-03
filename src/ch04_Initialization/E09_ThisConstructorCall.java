//: initialization/E09_ThisConstructorCall.java
/****************** Exercise 9 *****************
* Create a class with two (overloaded)
* constructors. Using this, call the second
* constructor inside the first one.
***********************************************/
package ch04_Initialization;

public class E09_ThisConstructorCall {
	public E09_ThisConstructorCall(int i){
		this("i= " + i);
	}
	public E09_ThisConstructorCall(String s){
		System.out.println("s= " + s);
	}
	public static void main(String[] args){
		new E09_ThisConstructorCall(14);
		new E09_ThisConstructorCall("SSS");
	}
}
