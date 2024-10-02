package com.demo;

public class StaticDemo {
	int n; //non static  or instance variable 
	static int no=changeNo();//100;
	static
	{
		no=200;
		System.out.println("in static block");
	}
	static int changeNo()
	{
		System.out.println("In static method");
		return 500;
	}
	public StaticDemo()
	{System.out.println("Constructor");
		
	}
	public StaticDemo(int a)
	{
		no=a;
		n=a;
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		System.out.println("----in main method------");
	//	n=10; instance variable cann't be accessed directly
		
		StaticDemo s=new StaticDemo();
		s.n=10;
		System.out.println(s.n);
		//no=20;
		System.out.println(StaticDemo.no);
		StaticDemo s1=new StaticDemo(4);
		System.out.println(s1.n);
		System.out.println(StaticDemo.no);
	}

}
