package com.moussi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * https://github.com/Moussi/Whats_New_In_Java8
 * 
 * @author MOUSSI Aymen
 *
 */
public class StreamMapExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("d2", "a2", "b1", "b3", "c");
		List<String> list2 = new ArrayList<>();
		list.stream().sorted((s1, s2) -> {
			return s1.compareTo(s2);
		}).map(s -> {
			System.out.printf("map: %s \n", s);
			return s.toUpperCase();
		}).forEach(list2::add);
		;
		System.out.println("----- list2 sorted---------");
		list2.stream().forEach(s -> System.out.println("forEach: " + s));

	}

}
