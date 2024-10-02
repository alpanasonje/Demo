package com.tnsif.ahm04;

public class ChildThreadTwo implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
			System.out.println("Bye....");
		
	}

}
