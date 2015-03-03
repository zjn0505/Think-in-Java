//: control/E09_Fibonacci.java
// {Args: 20}
/****************** Exercise 9 **********************
* A Fibonacci sequence is the sequence of numbers 1,
* 1, 2, 3, 5, 8, 13, 21, 34, etc., where each
* number (from the third on) is the sum of the previous
* two. Create a method that takes an integer as an
* argument and displays that many Fibonacci numbers
* starting from the beginning. If, e.g., you run java
* Fibonacci 5 (where Fibonacci is the name of the
* class) the output will be: 1, 1, 2, 3, 5.
****************************************************/
package ch03_Control;

import java.util.Random;

public class E09_Fibonacci {
	static int fib(int n){
		if (n <= 2) return 1;
		return fib(n - 2) + fib(n - 1);
	}//recursion is used, a function call itself
	/**
	 * Binet's formula for the Fibonacci number
	 */
	static int fibBinet(int n){
		double x = Math.sqrt(5);
		double result = (Math.pow((1+x)/2,n)-Math.pow((1-x)/2,n))/x;
		return (int) result;
	}
	
	static void printFib(int n){
		for (int i = 1; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	public static void main(String[] args){
		if (args.length != 0) {
			printFib(Integer.parseInt(args[0]));
			System.out.println("");
			System.out.println(fibBinet(Integer.parseInt(args[0])));
		}else{
			Random rand = new Random();
			for (int i = 0; i < 7; i++) {
				int f = rand.nextInt(20);
				System.out.print((f + 13) + " digits: ");
				printFib(f + 13);
				System.out.println("");
			}
		}
		
	}
	
}
