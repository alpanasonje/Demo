//Program to demonstrate multi-threading
package com.tnsif.multithreading.one;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread thread = new ChildThread();

		// staring thread execution
		thread.start();
	}
}

