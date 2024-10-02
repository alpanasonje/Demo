//Program to demonstrate BinaryOperator Functional Interface
package com.tnsif.functionalinterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfacesDemo {
	public static void main(String[] args) {
		BinaryOperator<Integer> maxBy = (a, b) -> a > b ? a : b;
		//BinaryOperator<Integer>maxBy=BinaryOperator.maxBy(Comparator.naturalOrder());
		int max = maxBy.apply(5, 3); // 5
		System.out.println("Maximum of 5 and 3 is : " + max);

		List<Integer> numbers = Arrays.asList(100, 20, 30, 70, 40);
		System.out.println("List of Integers : " + numbers);

		// Sum all elements in the list using reduce and BinaryOperator
		BinaryOperator<Integer> sumOperator = Integer::sum; // or (a, b) -> a + b
		Optional<Integer> sum = numbers.stream().reduce(sumOperator);
		sum.ifPresent(s -> System.out.println("Sum of Integers : " + s));

		BinaryOperator<Integer> minBy =BinaryOperator.minBy(Comparator.naturalOrder());
		Optional<Integer> min = numbers.stream().reduce(minBy);
		if (min.isPresent())
			System.out.println("Minimum of Integers : " + min.get());
		// min.ifPresent(m -> System.out.println("Minimum of Integers : " + m));

		
		/*
		 * Consumer<String> printConsumer = System.out::println; // method reference
		 * printConsumer.accept("Hello, World!"); // prints "Hello, World!"
		 * 
		 * System.out.println("My favourite Fruits Are"); List<String> fruits =
		 * Arrays.asList("Mango", "Apple", "Banana", "Orange", "Grapes");
		 * fruits.forEach(printConsumer); // Prints each fruit in the list
		 * 
		 * System.out.println("------------------------------------"); Supplier<String>
		 * stringSupplier = () -> "Hello, World!";
		 * System.out.println(stringSupplier.get()); // Prints "Hello, World!"
		 * 
		 * Supplier<Double> randomSupplier = Math::random; double randomValue =
		 * randomSupplier.get(); // generates a random value
		 * System.out.println(randomValue);
		 * 
		 * //returns Stream of String Supplier<Stream<String>> streamSupplier = () ->
		 * Stream.of("Mango", "Apple", "Banana");
		 * streamSupplier.get().forEach(System.out::println);
		 * 
		 * 
		 * 
		 */

		/*
		 * // Function to return length of String Function<String, Integer>
		 * lengthFunction = String::length; int length = lengthFunction.apply("Hello");
		 * System.out.println("Length of 'Hello' is : " + length);
		 * 
		 * // Function to return Factorial of a number Function<Integer, Long>
		 * factorialFunction = (n) -> { Long f = 1L; for (int i = 1; i <= n; i++) f = f
		 * * i; return f; }; System.out.println("Factorial of 5 is " +
		 * factorialFunction.apply(5));
		 * 
		 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		 * 
		 * List<Long> factorials = numbers.stream() .map(factorialFunction) //maps to
		 * factorial .collect(Collectors.toList());
		 * 
		 * System.out.println("Factorials of 1 to 6 nos are\n" + factorials);
		 * 
		 * 
		 */

		// predicate to check string is empty or not
		/*
		 * Predicate<String> isEmpty = String::isEmpty; boolean result; result =
		 * isEmpty.test("Hello"); System.out.println("Is 'Hello' Empty? " + result);
		 * result = isEmpty.test(""); System.out.println("Is '' Empty? " + result);
		 * 
		 * // predicate to check number is even or not Predicate<Integer> isEven = (n)
		 * -> n % 2 == 0; result = isEven.test(12); System.out.println("Is 12 even? " +
		 * result); result = isEven.test(13); System.out.println("Is 13 even? " +
		 * result);
		 * 
		 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 * 
		 * List<Integer> evenNumbers = numbers.stream() .filter(isEven) //filters the
		 * data based on Predicates .collect(Collectors.toList());
		 * 
		 * System.out.println("Even Numbers : "+evenNumbers); // [2, 4, 6, 8, 10]
		 */ }
}