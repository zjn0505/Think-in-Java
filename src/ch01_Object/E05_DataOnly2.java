//: object/E05_DataOnly2.java
/****************** Exercise 5 ******************
* Modify Exercise 4 so the values
* of the data in DataOnly are assigned to and
* printed in main().
************************************************/
package ch01_Object;

public class E05_DataOnly2 {
	public static void main(String[] args){
		E04_DataOnly cE04 = new E04_DataOnly();
		cE04.i = 1100;
		cE04.d = 23.123;
		cE04.b = true;
		System.out.println(cE04.i);
		System.out.println(cE04.d);
		System.out.println(cE04.b);
	}
}
