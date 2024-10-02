/*Program to perform two task using multiple threads - 1)Check whether number is even or not? 
2) Display factorial of given number */
package com.tnsif.multithreading;
public class ThreadDemo {
	public static void main(String[] args) {
		// creating child thread
		ChildThread t = new ChildThread(5);
		t.start(); //will call run() method internally
		System.out.println(Thread.currentThread().getName() + " :\tIs 5 Even? " + Operations.isEven(5));
	}
}
