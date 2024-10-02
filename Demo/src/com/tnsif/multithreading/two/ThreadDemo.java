//Program to demonstrate multi-threading
package com.tnsif.multithreading.two;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException //declaring exception
	{
		System.out.println("--------------Starting----------------");
		ChildThread thread = new ChildThread();
		thread.start(); // staring thread execution
		Thread.sleep(1000); //pause the main thread for 1 second
		System.out.println("-------------After Sleep--------------");
	}
}

