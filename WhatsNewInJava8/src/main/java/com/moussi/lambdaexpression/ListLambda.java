package com.moussi.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Aymen
 *
 */
public class ListLambda {

	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("a","d","c","b");
		System.out.println("-----------Sorted List with reference method-------------");
		list.forEach(System.out::println);
		Collections.sort(list);
		System.out.println("-----------Sorted List with NO reference method-----------");
		list.forEach(s -> System.out.println(s));
	}

}
