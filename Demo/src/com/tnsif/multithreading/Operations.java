package com.tnsif.multithreading;

public class Operations {
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static long getFactorial(int number) {
		if (number > 0)
			return number * getFactorial(number-1);
		else
			return 1;

	}
}
