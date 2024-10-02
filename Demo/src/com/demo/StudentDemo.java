package com.demo;

public class StudentDemo {

	public static void main(String[] args) {
		System.out.println(Student.college);
		Student s1=new Student(1, "Aniket", "CS");
		Student s2=new Student(2, "Ankit", "CS");
		Student s3=new Student(3, "Niket", "E&TC");
		Student s4=new Student(4, "Sanket", "IT");
		s1.college="GESRHSCOEMS&R";
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		System.out.println(Student.college);
	}

}
