package com.moussi.lambdaexpression.newpatterns;

/**
 * https://github.com/Moussi/Whats_New_In_Java8
 * @author MOUSSI Aymen
 *
 */
public interface Icalculator {

	int add(int a, int b);
	int substruct(int a, int b);
	
	default void showResult(int c){
		System.out.println("default method result = "+c);
	}
	static void showStaticResult(int c){
		System.out.println("static method result = "+c);
	}
	
}
