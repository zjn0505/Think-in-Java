//: initialization/E10_FinalizeCall.java
/****************** Exercise 10 *****************
* Create a class with a finalize() method that
* prints a message. In main(), create an object
* of your class. Explain the behavior of your
* program.
************************************************/
package ch04_Initialization;

public class E10_FinalizeCall {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am done.");
		super.finalize();
	}
	public static void main(String[] args){
		new E10_FinalizeCall();
		System.gc();
	}
}
