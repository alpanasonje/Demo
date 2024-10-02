//Program to demonstrate Java Stream API
package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("avocado", "apple", "banana", "cherry");
		System.out.println("Favorite Fruits : "+list);
		// Creating a Stream
		List<String> result = list.stream()
				.filter(s -> s.startsWith("a")) // Intermediate Operation
				.map(String::toUpperCase) // Intermediate Operation
				.sorted() // Intermediate Operation
				.collect(Collectors.toList()); // Terminal Operation
		System.out.println("Fruits starts with A");
		result.forEach(System.out::println); // Output: APPLE, AVOCADO

		// Creating a Stream
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 2, 1);
		long cnt = numbers.distinct() // Intermediate Operation
				.count(); // Terminal Operation
		System.out.println("Count of Distinct Numbers : " + cnt);
		
		
		
		
		
		
		
		/*
		 * list = Arrays.asList("a", "b", "c", "d"); Stream<String> stream =
		 * list.stream();
		 * 
		 * Stream<Integer> numbers = Stream.of(1, 2, 3, 4);
		 * 
		 * Stream<Double> randoms = Stream.generate(Math::random).limit(10);
		 * 
		 * list = Arrays.asList("apple", "banana", "cherry", "date");
		 * 
		 * Stream<String> filteredStream = list.stream() .filter(s ->
		 * s.startsWith("a")); // Filter elements starting with "a"
		 * 
		 * Stream<String> upperCaseStream = list.stream() .map(String::toUpperCase); //
		 * Convert elements to upper case
		 * 
		 * Stream<String> sortedStream = list.stream() .sorted(); // Sort the elements
		 * 
		 * list.stream() .filter(s -> s.startsWith("a")) .forEach(System.out::println);
		 * // Print each element
		 * 
		 * long count = list.stream() .filter(s -> s.length() > 5) .count(); // Count
		 * elements with length greater than 5
		 * 
		 * List<String> resultList = list.stream() .sorted()
		 * .collect(Collectors.toList()); // Collect elements into a list
		 * 
		 */

	}

}
