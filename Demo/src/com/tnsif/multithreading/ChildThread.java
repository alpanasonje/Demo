//Program to define child thread class 
package com.tnsif.multithreading;
public class ChildThread extends Thread {
	int number;
	public ChildThread(int number) {
		this.number = number;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " : Factorial of " + number + " is "
				+ Operations.getFactorial(number));
	}
}
