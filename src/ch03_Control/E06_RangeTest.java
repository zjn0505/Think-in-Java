//: control/E06_RangeTest.java
/****************** Exercise 6 ******************
* Modify the two test() methods in the previous
* two programs so they take two extra
* arguments, begin and end, and so testval is
* tested to see if it is within the range between
* (and including) begin and end.
************************************************/
package ch03_Control;

public class E06_RangeTest {
	static boolean test(int testval, int begin, int end){
		boolean result = false;
		if (testval >= begin && testval <= end)
			result = true;
		return result;
	}
	public static void main(String[] args){
		System.out.println(test(1,2,3));
		System.out.println(test(3,1,2));
		System.out.println(test(2,1,3));
	}
}
