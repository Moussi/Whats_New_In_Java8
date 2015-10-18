package com.moussi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * @author MOUSSI Aymen
 *
 */
public class StreamsExample2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three", "four","five");
		List<String> list2 = new ArrayList<>();
		Predicate<String> p1 = s -> s.length()>3;
		Predicate<String> p2 = s -> s.equals("two");
		System.out.println("using peek as a final operation => Wrong nothing will happen list2 will stay empty");
		list.stream().peek(System.out::println).filter(p1.or(p2)).peek(list2::add);
		System.out.println("peek filter peek done ===> size = "+list2.size());
		System.out.println("using forEach as a final operation and peek as an intermediary operation => list2 will be initialized");
		list.stream().peek(System.out::println).filter(p1.or(p2)).forEach(list2::add);
		System.out.println("peek filter forEach done ===> size = "+list2.size());
		
	}

}
