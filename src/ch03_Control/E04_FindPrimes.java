//: control/E04_FindPrimes.java
/****************** Exercise 4 ******************
* Write a program to detect and print prime numbers
* (integers evenly divisible only by themselves
* and 1), using two nested for loops and the
* modulus operator (%).
************************************************/
package ch03_Control;

public class E04_FindPrimes {
	public static void main(String[] args){
		int max = 100;
		if (args.length != 0) {
			max = Integer.parseInt(args[0]);
		}
		for (int i = 2; i < max; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
	}

}
