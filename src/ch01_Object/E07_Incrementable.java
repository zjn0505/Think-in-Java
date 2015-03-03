//: object/E07_Incrementable.java
/****************** Exercise 7 ******************
* Turn the Incrementable code fragments into a
* working program.
************************************************/
package ch01_Object;

class StaticTest {
	static int i = 47;
}

public class E07_Incrementable {
	static void increment(){ StaticTest.i++; }
	public static void main(String[] args){
		E07_Incrementable cE07 = new E07_Incrementable();
		cE07.increment();
		System.out.println(StaticTest.i);
		E07_Incrementable.increment();
		System.out.println(StaticTest.i);
		increment();//call increment() by itself, because a static method can call another static method without qualification
		System.out.println(StaticTest.i);
	}
	
	
	
	
}
