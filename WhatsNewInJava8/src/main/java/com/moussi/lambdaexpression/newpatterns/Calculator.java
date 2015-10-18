package com.moussi.lambdaexpression.newpatterns;

/**
 * https://github.com/Moussi/Whats_New_In_Java8
 * @author MOUSSI Aymen
 *
 */
public class Calculator implements Icalculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substruct(int a, int b) {
		return a-b;
	}

}
