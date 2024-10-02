//Program to demonstrate accessing shared resource without synchronization
package com.tnsif.multithreading.synchronization;

public class UnsynchronizedExample {
	public static void main(String[] args) {
		Counter example = new Counter(); //shared resource
		// Create and start multiple threads
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				example.incrementOne(); //increment counter
				try {
					Thread.sleep(500); // Simulate some delay
				} catch (InterruptedException e) {
					e.printStackTrace();				}
			}		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				example.incrementOne(); //increment counter
				try {
					Thread.sleep(500); // Simulate some delay
				} catch (InterruptedException e) {
					e.printStackTrace();				}
			}		});
		// Start both threads
		thread1.start();
		thread2.start();
	}
}
