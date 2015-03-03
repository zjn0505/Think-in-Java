//: operators/E07_CoinFlipping.java
/****************** Exercise 7 *****************
* Write a program that simulates coin-flipping.
***********************************************/
package ch02_Operators;
import java.util.Random;

public class E07_CoinFlipping {
	public static void main(String[] args){
		Random rand = new Random(47);
		Boolean flip = rand.nextBoolean();
		System.out.print("OUTCOME: ");
		System.out.println(flip ? "HEAD" : "TAIL");
	}
}
