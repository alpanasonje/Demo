package com.demo;

public class Demo {
	void display()
	{
		System.out.println("Display without parameter");
	}
	//variable length arguments
	void show(int ...a)
	{
		System.out.println("No. of parameters : "+a.length);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		
		d.show();
		d.show(10);
		d.show(10,50);
		d.show(1,2,3,4,5);

	}

}
