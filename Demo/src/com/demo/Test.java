package com.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a[];
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		n=sc.nextInt();
		a=new int[n];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter array element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("---------Array is as follows-----");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");

	}

}
