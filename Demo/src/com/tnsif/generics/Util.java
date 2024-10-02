package com.tnsif.generics;

import java.util.List;

class Util {
	// Generic Method
	public static <T> void printArray(T[] array) {
		for (T element : array)
			System.out.print(element + "\t");
		System.out.println();
	}
	// Method with Unbounded Wildcard
	public static void processElements(List<?> elements) {
		for (Object element : elements)
			System.out.print(element + "\t");
		System.out.println();
	}
	// Method with Upper Bounded Wildcard
	public static void processNumbers(List<? extends Number> numbers) {
		for (Number number : numbers)
			System.out.print(number + "\t");
		System.out.println();
	}
	// Method with Lower Bounded Wildcard
	public static void addIntegers(List<? super Integer> list) {
		list.add(1);
		list.add(2);
	}
}