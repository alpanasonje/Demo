//Program to define a resource with synchronization using Synchronized method and Synchronized block
package com.tnsif.multithreading.synchronization;
public class Counter {
	private int count = 0;
	// Synchronized method to increment the count
	public synchronized void increment() {
		count++;
		System.out.println(Thread.currentThread().getName() + " : Incremented count to " + count);
	}
	
	// Method to increment count using synchronized block
    public void incrementOne() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " : Incremented count to " + count);
        }   }
}

/*
 * //Non Synchronized method to increment the count public void incrementOne() {
 * count++; System.out.println(Thread.currentThread().getName() +
 * " : Incremented count to " + count); }
 */