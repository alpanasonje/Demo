//Program to define child thread class
package com.tnsif.multithreading.one;

public class ChildThread extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
