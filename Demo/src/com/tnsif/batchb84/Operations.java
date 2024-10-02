package com.tnsif.batchb84;

public class Operations {
	//Method Overloading - Compile Time Poly-morphism
	//Defining same name method with different signature
	//Different Signature includes -
	
	void addition(int a, int b) //2 integer parameters
	{
		int c;
		c=a+b;
		System.out.println("Addition is "+c);
	}
	void addition() //without parameters
	{
		
	}
	void addition(float a, float b) //2 float parameters
	{
		float c;
		c=a+b;
		System.out.println("addition is "+c);
	}
	void addition(long a, long b) //2 integer parameters
	{
	System.out.println("Long parameters");	
	}
	void addition(float a, int b) //2 parameters - float and int
	{
		
	}
	void addition(int a, float b) //2 parameters -  int and float
	{
		
	}
	
	
	void display()
	{
		System.out.println("-----------------Display() ------------");
	}
	
	void display(String name)
	{
		System.out.println("Hello "+name);
	}
	
	void display(int n, String name)
	{
		for(int i=1;i<=n;i++)
				System.out.println(name);
	}

}
