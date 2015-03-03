//: object/E08_StaticTest.java
/****************** Exercise 8 ******************
* Write a program to demonstrate that no
* matter how many objects you create of a
* particular class, there is only one instance
* of a particular static field in that class.
************************************************/
package ch01_Object;
class StaticClass{
	static int i = 9;
}
public class E08_StaticTest {
	public static void main(String[] args){
		StaticClass s1 = new StaticClass();
		StaticClass s2 = new StaticClass();
		
		System.out.println(s2.i);
		s1.i++;
		System.out.println(s2.i);
	}
}
