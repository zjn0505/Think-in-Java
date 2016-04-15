//: initialization/E05_OverloadedDog.java
/****************** Exercise 5 *****************
* Create a class called Dog with an overloaded
* bark() method. Your method should be
* overloaded based on various primitive data
* types, and should print different types of barking,
* howling, etc., depending on which overloaded
* version is called. Write a main() that calls
* all the different versions.
***********************************************/
package ch04_Initialization.Exercise;

class Dog{
	void bark() {
		System.out.println("Default bark");
	}
	void bark(int i){
		System.out.println("Howling " + i);
	}
	void bark(double d){
		System.out.println("Woffing " + d);
	}
	
	boolean Print(int i){
		System.out.println(i);
		return false;
	}
}
public class E05_OverloadedDog {
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.bark(1);
		dog.bark(1.0);
		
	}
}
