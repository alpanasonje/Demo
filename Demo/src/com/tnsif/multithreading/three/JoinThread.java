//Program to create a child thread
package com.tnsif.multithreading.three;

public class JoinThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(1000); // Pause the thread for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
