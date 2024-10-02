package com.tnsif.ahm04;

public class ChildThread extends Thread {

	public void run() {
		System.out.println("Is 7 prime number? " + Operations.checkPrime(7));
	}
}
