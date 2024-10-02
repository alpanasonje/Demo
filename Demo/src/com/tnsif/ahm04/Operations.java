package com.tnsif.ahm04;

public class Operations {
	public static void OddEven(int number) {
		if (number % 2 == 0)
			System.out.println(Thread.currentThread().getName() + number + " is Even");
		else
			System.out.println(Thread.currentThread().getName() + number + " is Odd");
	}

	public static boolean checkPrime(int number) {
		System.out.println(Thread.currentThread().getName()+" checkPrime");
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				return false;
			}
		}

		return true;

	}
}
