package com.moussi.lambdaexpression.newpatterns;

/**
 * 
 * @author Aymen
 *
 */
public class DefaultMethodsMain {

	public static void main(String[] args) {

		Icalculator cal = new Calculator();
		int result = cal.add(5, 6);
		System.out.println("Show results using methods implemented on interface");
		cal.showResult(result);
		result = cal.substruct(11, 2);
		Icalculator.showStaticResult(result);
	}

}
