//: operators/E03_Aliasing2.java
/****************** Exercise 3 *****************
* Create a class containing a float and use it
* to demonstrate aliasing during method calls.
***********************************************/
package ch02_Operators;

public class E03_Aliasing2 {
	static void f(Integral y){
		y.f = 1.0f;
	}
	public static void main(String[] args){
		Integral x = new Integral();
		x.f = 2.0f;
		System.out.println("1: x.f: " + x.f);
		f(x);
		System.out.println("1: x.f: " + x.f);
	}
}
