package com.demo;

public class Student {
	int uID;
	String name;
	String branch;
	static String college="PVG, Nashik";
	public Student() {
	
	}
	public Student(int uID, String name, String branch) {
		this.uID = uID;
		this.name = name;
		this.branch = branch;
	}
	//static method uses static members only
	static void display()
	{
		//this.name=""; this keyword is not allowed in static context
		//non static members are not accessible in static context
	//	System.out.println("Name : "+name +" UID : "+uID+" Branch : "+branch+ " College Name : "+college);
		System.out.println(" College Name : "+college);
	}
	public void show()
	{
		System.out.println("Name : "+this.name +" UID : "+uID+" Branch : "+branch+ " College Name : "+college);
	}
}
