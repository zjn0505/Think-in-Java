//: object/E10_ShowArgs.java
// {Args: A B C}
/****************** Exercise 10 ****************
* Write a program that prints three arguments
* taken from the command line.
* You'll need to index into the command-line
* array of Strings.
***********************************************/
package ch01_Object;

public class E10_ShowArgs {
	public static void main(String[] args){
		if (args.length < 3) {
			System.err.println("Need 3 arguments");
			System.exit(1);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
