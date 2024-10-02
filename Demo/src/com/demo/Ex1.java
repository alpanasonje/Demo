package com.demo;
import java.util.Scanner;

public class Ex1 {
	public static void main(String args[])
	{
		int a,b,c,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Menu: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		do {
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					c=a+b;
					System.out.println("Addition of two number is: " + c);
					break;
				case 2:
					c=a-b;
					System.out.println("Subtraction of two number is: " + c);
					break;
				case 3:
					c=a*b;
					System.out.println("Multiplication of two number is: " + c);
					break;
				case 4:
					float d;
					d=(float)a/b;
					System.out.println("Division of two number is: " + d);
					break;
			}
		}while(ch!=4);
	}
}
