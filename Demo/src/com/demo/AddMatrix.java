package com.demo;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int n = sc.nextInt();
		int c[][] = new int[m][n];
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];

		System.out.println("Enter First Matrix");
		for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();

		System.out.println("Enter Second Matrix");
		for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++) 
				b[i][j] = sc.nextInt();
		
		System.out.println("Resultant Matrix");
		for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++) 
				c[i][j] = a[i][j] + b[i][j];

		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{ 
				if (i == j) 
				{
					c[i][j] = 0;
				}
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
