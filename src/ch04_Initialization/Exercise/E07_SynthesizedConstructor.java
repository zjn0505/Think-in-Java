//: initialization/E07_SynthesizedConstructor.java
/****************** Exercise 7 ******************
* Create a class without a constructor, then
* create an object of that class in main() to
* verify that the default constructor is
* automatically synthesized.
************************************************/
package ch04_Initialization.Exercise;

public class E07_SynthesizedConstructor {
	public static void main(String[] args){
		E07_SynthesizedConstructor sc = new E07_SynthesizedConstructor();
	}
}
