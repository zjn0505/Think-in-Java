//: object/E12_LeftToReader.java
/****************** Exercise 12 *****************
* Find the code for the second version of
* HelloDate.java, the simple comment-
* documentation example. Execute Javadoc on the
* file and view the results with your Web browser.
* @author Bruce Eckel
* @author www.MindView.net
* @version 4.0
************************************************/
package ch01_Object;

import java.util.Date;

public class E12_HelloDate {
	/** Entry point to class & application.
	* @param args array of string arguments
	* @throws exceptions No exceptions thrown
	*/
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	}
}
