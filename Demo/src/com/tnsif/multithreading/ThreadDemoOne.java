/*Program to perform two task using multiple threads - 1)Check whether number is even or not?   
2) Display factorial of given number */
package com.tnsif.multithreading;
public class ThreadDemoOne {
	public static void main(String[] args) {
		// creating child thread
		ChildThread t = new ChildThread(5);
		//t.start();
		t.run(); //calling run method manually
		System.out.println(Thread.currentThread().getName() + " :\tIs 5 Even? " + Operations.isEven(5));
	}
}

