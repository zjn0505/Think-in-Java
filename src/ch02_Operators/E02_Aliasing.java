//: operators/E02_Aliasing.java
/****************** Exercise 2 *****************
* Create a class containing a float and use it to
* demonstrate aliasing.
***********************************************/
package ch02_Operators;

class Integral{
	float f;
}

public class E02_Aliasing {
	public static void main(String[] args){
		Integral n1 = new Integral();
		Integral n2 = new Integral();
		n1.f = 9f;
		n2.f = 1222f;
		System.out.println("1: n1.f: " + n1.f +" n2.f: " + n2.f);
		n1 = n2;
		System.out.println("1: n1.f: " + n1.f +" n2.f: " + n2.f);
		n1.f = 123f;
		System.out.println("1: n1.f: " + n1.f +" n2.f: " + n2.f);
	}
}
