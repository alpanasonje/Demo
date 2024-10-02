//Program to define child thread class
package com.tnsif.multithreading.three;

public class Demo {
	public static void main(String[] args) {
		System.out.println("--------------Starting main thread----------------");

		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable rr = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("\t\t\tHello : " + Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread threadOne = new Thread(r, "ThreadOne");
		Thread threadTwo = new Thread(rr, "ThreadTwo");
		threadOne.start();
		threadTwo.start();
		System.out.println("--------------Ending of main thread--------------");

	}
}
