//: operators/E04_Velocity.java
// {Args: 30.5 3.2}
/****************** Exercise 4 *****************
* Write a program that calculates velocity
* using a constant distance and a constant time.
***********************************************/
package ch02_Operators;

public class E04_Velocity {
	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("Usage: java E04_Velocity distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.print("Velocity = ");
		System.out.print(distance / time);
		System.out.println(" m/s");
	}
}
