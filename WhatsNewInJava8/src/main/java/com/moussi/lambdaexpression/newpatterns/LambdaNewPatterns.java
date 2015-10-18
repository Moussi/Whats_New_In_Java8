package com.moussi.lambdaexpression.newpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * https://github.com/Moussi/Whats_New_In_Java8
 * 
 * @author MOUSSI Aymen
 *
 */
public class LambdaNewPatterns {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("one", "two", "three", "four");
		List<String> result = new ArrayList<String>();
		// consumer
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = result::add;
		System.out
				.println("------------Show list with consumer c1------------");
		list.forEach(c1);
		System.out
				.println("------------Show result with consumer c1 and c2---");
		list.forEach(c1.andThen(c2));

		System.out.println("result size = " + result.size());

	}
}
