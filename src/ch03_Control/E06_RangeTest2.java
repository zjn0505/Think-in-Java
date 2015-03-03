//: control/E06_RangeTest2.java
// No intermediate 'result' value necessary:
package ch03_Control;

public class E06_RangeTest2 {
	static boolean test(int testval, int begin, int end){
		if (testval >= begin && testval <= end)
			return true;
		return false;
	}
	public static void main(String[] args){
		System.out.println(test(1,2,3));
		System.out.println(test(3,1,2));
		System.out.println(test(2,1,3));
	}
}
