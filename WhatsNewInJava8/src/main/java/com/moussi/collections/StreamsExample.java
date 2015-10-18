package com.moussi.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/**
 * @author Aymen
 *
 */
class StreamsExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three", "four","five");
		Predicate<String> p1 = s -> s.length()>3;
		Predicate<String> p2 = s -> s.equals("two");
		Predicate<String> p3 = Predicate.isEqual("three");
		System.out.println("print Elements of the stream which are iquals to 'two' or 'three'");
		list.stream().filter(p2.or(p3)).forEach(System.out::println);
		System.out.println("print Elements of the stream which are iquals to 'two' or or length>3");
		list.stream().filter(p1.or(p2)).forEach(System.out::println);
		System.out.println("print Elements of the stream which are iquals to 'three' or length>3");
		list.stream().filter(p1.or(p3)).forEach(System.out::println);
		
	}

}
