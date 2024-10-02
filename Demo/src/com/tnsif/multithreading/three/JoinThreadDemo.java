//Program to demonstrate use of join method
package com.tnsif.multithreading.three;

public class JoinThreadDemo {
	public static void main(String[] args) {
		JoinThread threadOne = new JoinThread();
		JoinThread threadTwo = new JoinThread();
		// Start the first thread
		threadOne.start();
		try {
			// Wait for the first thread to complete before starting the second thread
			threadOne.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Start the second thread
		threadTwo.start();
		// Output in the main thread
		System.out.println(Thread.currentThread().getName() + " : Main thread finished.");
	}
}
