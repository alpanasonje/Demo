//Program to demonstrate Optional class in Java
package com.demo;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// Creating Optionals
		Optional<String> optional1 = Optional.of("Hello");
		Optional<String> optional2 = Optional.ofNullable(null);
		Optional<String> optional3 = Optional.empty();

		// Checking presence
		System.out.println("optional1 is present: " + optional1.isPresent()); // true
		System.out.println("optional2 is empty: " + optional2.isEmpty()); // true
		System.out.println("optional3 is empty: " + optional3.isEmpty()); // true
		// Retrieving values
		System.out.println("optional1 value: " + optional1.orElse("Default")); // Hello
		System.out.println("optional2 value: " + optional2.orElse("Default")); // Default

		// Transforming values
		Optional<String> upperCaseOptional = optional1.map(String::toUpperCase);
		System.out.println("upperCaseOptional: " + upperCaseOptional.orElse("No Value")); // HELLO

		Optional<Integer> lengthOptional = optional1.map(String::length);
		System.out.println("lengthOptional: " + lengthOptional.orElse(0)); // 5

		// Handling absence of value
		optional1.ifPresent(value -> System.out.println("Value: " + value)); // Prints "Value: Hello"

		Optional<String> filteredOptional = optional1.filter(value -> value.startsWith("H"));
		System.out.println("filteredOptional: " + filteredOptional.orElse("No Value")); // Hello
	}
}
