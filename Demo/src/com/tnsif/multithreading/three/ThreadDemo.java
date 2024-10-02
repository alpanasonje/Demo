//Program to demonstrate multi-threading
package com.tnsif.multithreading.three;

public class ThreadDemo {
	static int maxAge, minAge, difference;

	public static void main(String[] args) throws InterruptedException // declaring exception
	{
		System.out.println("--------------Starting main thread----------------");
		int ages[] = { 12, 56, 76, 88, 23, 50, 7, 28 };

		Runnable r = () -> {
			maxAge = Operations.getMaxAge(ages);
		};

		Runnable rr = () -> {
			minAge = Operations.getMinAge(ages);
		};

		Thread threadOne = new Thread(r, "ThreadOne");
		Thread threadTwo = new Thread(rr, "ThreadTwo");
		threadOne.start();
		threadTwo.start();
		 threadOne.join();
		 threadTwo.join();
		System.out.println("Maximum age is : " + maxAge);
		System.out.println("Minimum age is : " + minAge);
		difference = maxAge - minAge;
		System.out.println("Difference of ages is : " + difference);
		System.out.println("--------------Ending of main thread--------------");
	}
}
