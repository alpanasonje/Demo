//Program to define class implementing Runnable interface
package com.tnsif.multithreading;
public class MyRunnable implements Runnable {
	int number;

	public MyRunnable(int number) {
		super();
		this.number = number;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : Factorial of " + number + " is "
				+ Operations.getFactorial(number));
	}
}
