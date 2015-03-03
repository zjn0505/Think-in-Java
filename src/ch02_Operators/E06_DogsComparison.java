//: operators/E06_DogsComparison.java
/****************** Exercise 6 *****************
* Following Exercise 5 assign, a new Dog
* reference to spot's object. Test for comparison
* using == and equals() for all references.
***********************************************/
package ch02_Operators;

public class E06_DogsComparison {
	static void compare(Dog dog1, Dog dog2){
		System.out.println("== on top references: " + (dog1 == dog2));
		System.out.println("equals() on top references: " + dog1.equals(dog2));
		System.out.println("== on names: " + (dog1.name == dog2.name));
		System.out.println("equals() on names: " + dog1.name.equals(dog2.name));
		System.out.println("== on says: " + (dog1.says == dog2.says));
		System.out.println("equals() on says: " + dog1.says.equals(dog2.says));
	}
	public static void main(String[] args){
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = dog1;
		dog1.name = "spot";
		dog1.says = "Ruff!";
		dog2.name = "scruffy";
		dog2.says = "Wurf!";
		System.out.println("Comparing dog1 and dog2 objects...");
		compare(dog1, dog2);
		System.out.println("Comparing dog1 and dog3 objects...");
		compare(dog1, dog3);
		System.out.println("Comparing dog2 and dog3 objects...");
		compare(dog2, dog3);
	}
}
