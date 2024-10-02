package com.tnsif.batchb84;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Point p1;
		p1=new Point(); //default constructor
		System.out.println(p1);
		
		p1=new Point(12); //single parameter constructor
		System.out.println(p1);
		
		p1=new Point(12.50f,20); //2 parameters constructor
		System.out.println(p1);
		
		
	}

}
