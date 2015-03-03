//: control/E08_SwitchDemo.java
/****************** Exercise 8 *****************
* Create a switch statement inside a for loop
* that tries each case and prints a message. Put
* a break after each case and test it, then see
* what happens when you remove the breaks.
***********************************************/
package ch03_Control;

public class E08_SwitchDemo {
	public static void main(String[] args){
		for(int i = 0; i < 8; i++){
			switch(i){
				case 1: System.out.println("case 1"); break;
				case 2: System.out.println("case 2"); break;
				case 3: System.out.println("case 3"); break;
				default: System.out.println("end"); //default是对其它所有情况的判断
				case 4: System.out.println("case 4"); break;
				case 5:
				case 6: System.out.println("maybe 5 maybe 6");break;
				case 0: System.out.println("could be 0 as well"); break;
			}
		}
	}

}
