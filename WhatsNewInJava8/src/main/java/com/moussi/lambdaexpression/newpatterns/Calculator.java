package com.moussi.lambdaexpression.newpatterns;

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
