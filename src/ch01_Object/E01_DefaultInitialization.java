//: object/E01_DefaultInitialization.java
/****************** Exercise 1 *****************
* Create a class containing an int and a char
* that are not initialized. Print their values
* to verify that Java performs default
* initialization.
***********************************************/

package ch01_Object;

public class E01_DefaultInitialization {
	int i;
	char c;
	
	void show(){
		System.out.println("i = " + i);
		System.out.println("c = [" + c + "]");
	}
	
	public static void main(String[] Args){
		//错误
		//System.out.println(i);
		//main()方法是静态方法，在静态方法中调用非静态变量
		//会报错：Cannot make a static reference to the non-static field
		
		//解决方法
		//创建类的实例，通过实例调用内部非静态变量
		E01_DefaultInitialization cE01 = new E01_DefaultInitialization();
		System.out.println(cE01.i);
		System.out.println(cE01.c);
		
		cE01.show();
	}
}
