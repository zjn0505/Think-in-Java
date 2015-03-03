//: control/E02_RandomInts.java
/****************** Exercise 2 ******************
* Write a program to generate 25 random int
* values. Use an if-else statement for each value
* to classify it as greater than, less than, or
* equal to a second randomly generated value.
************************************************/
package ch03_Control;

import java.util.Random;

public class E02_RandomInts {
	static Random rand = new Random(47);//put in the outside, since 47 confined the candidate list
	public static void compareRand(){
		 int a = rand.nextInt();
		 int b = rand.nextInt();
		 if (a > b)
			 System.out.println(a + " > " + b);
		 else if (a < b)
			 System.out.println(a + " < " + b);
		 else
			 System.out.println(a + " = " + b);
	 }
	 public static void main(String[] args){
		 for (int i = 0; i < 25; i++) {
			compareRand();
		}
	 }

}
