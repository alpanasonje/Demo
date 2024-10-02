package com.tnsif.tcs;
import java.util.Scanner;
public class MemorizeDemo {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many numbers : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Element : ");
			arr[i] = s.nextInt();
		}
		System.out.println("Enter no. of testcase : ");
		int test = s.nextInt();
		for (int j = 0; j < test; j++) {
			System.out.println("Enter Element : ");
			int num = s.nextInt();
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (num == arr[i]) 
					count++;				
			}
			if (count == 0)
				System.out.println("NOT PRESENT");
			else
				System.out.println("occurrences : " + count);
		}
	}
}
