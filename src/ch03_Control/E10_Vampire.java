//: control/E10_Vampire.java
/****************** Exercise 10 *********************
* A vampire number has an even number of digits and
* is formed by multiplying a pair of numbers containing
* half the number of digits of the result. The digits
* are taken from the original number in any order.
* Pairs of trailing zeroes are not allowed. Examples
* include:
* 1260 = 21 * 60
* 1827 = 21 * 87
* 2187 = 27 * 81
* Write a program that finds all the 4-digit vampire
* numbers. (Suggested by Dan Forhan.)
****************************************************/
package ch03_Control;

public class E10_Vampire {

	public static void main(String[] args){
		for (int c = 1000; c < 10000; c++) {
			int c4 = c % 10;  int c3 = (c - c4) % 100;
			int c1 = c / 1000; int c2 = (c - c1 * 1000) / 100;
			// c1|c2|c3|c4
			int[] cSet = {c1, c2, c3, c4};
			for (int i1 = 0; i1 < 4; i1++) {
				if (cSet[i1] == 0) continue; //m1第一位不能0
				for (int i2 = 0; i2 < 4; i2++) {
					if (i1 == i2) continue;  //m1两个组成数不能来自同一个数
					int m1 = cSet[i1] * 10 + cSet[i2];
					if (c % m1 != 0) continue;//c必须能被m1整除
					if (c / m1 > 99) continue;
					
					for (int i3 = 0; i3 < 4; i3++) {
						if(i3 == i1 || i3 == i2) continue;
						int m2 = c / m1;
						if (m2 / 10 != cSet[i3]) continue;
						
						for(int i4 = 0; i4 < 4; i4++){
							if(i4 == i1 || i4 == i2 || i4 == i3) continue;
							if (m2 % 10 == cSet[i4]) {
								System.out.println(c + " = " + m1 + " * " + m2);
						}
							
						}
						
						
					}
					
					
				}
			}
		}
	}
}
