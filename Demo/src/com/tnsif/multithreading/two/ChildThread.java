//Program to define child thread class and introduce Thread.sleep() method
package com.tnsif.multithreading.two;
public class ChildThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(500);//pause for half second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

