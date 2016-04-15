//: initialization/E12_TankWithTerminationCondition.java
/********************* Exercise 12 ********************
* Create a class called Tank that can be filled
* and emptied, with a termination condition that it
* must be empty when the object is cleaned up.
* Write a finalize() that verifies this termination
* condition. In main(), test the possible
* scenarios that can occur when you use Tank.
******************************************************/
package ch04_Initialization.Exercise;

class Tank{
	static int counter;
	int id = counter++;
	boolean full;
	public Tank(){
		System.out.println("Tank " + id + " created");
		full = true;
	}
	public void empty(){
		full = false;
	}
	@Override
	protected void finalize() throws Throwable {
		if(full) System.out.println("Error: full tank " + id + " can't be cleanuped");
		else System.out.println("Tank " + id + " is cleanuped");
		super.finalize();
	}
}

public class E12_TankWithTerminationCondition {
	public static void main(String[] args){
		new Tank().empty();
		new Tank();
		System.gc();
		System.runFinalization();
		
	}
}
