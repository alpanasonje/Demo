package com.tnsif.ahm04;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("------Starting main thread----------------"+Thread.currentThread().getName());
		/*Operations.OddEven(10);
	    
		//creating child thread
		ChildThread t=new ChildThread();
		t.start(); //starts execution internally calls run() method
	*/
		/*
		 * MyThread t1=new MyThread(); //thread-0 MyThread t2=new MyThread(); //thread-1
		 * t1.start(); t2.start(); //t1.run(); //converts application into single
		 * threaded //t2.run();
		 */		
		
		
		ChildThreadOne r=new ChildThreadOne();
		Thread t1=new Thread(r);
		
		
		ChildThreadTwo rr=new ChildThreadTwo();
		Thread t2=new Thread(rr);
		
		t1.start();
		t2.start();
		System.out.println("---------End of main thread-------------"+Thread.currentThread().getName());
	}

}
