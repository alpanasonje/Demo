package com.tnsif.tcs;

import java.util.Scanner;

public class MaximumAttendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		String arr[] = new String[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.next();

		String present = "";
		int j = 0;
		while (j < m) {
			present = present + "P";
			j++;
		}
		int max = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].equals(present))
				count++;
			else {
				max = Math.max(max, count);
				count = 0;
			}
		}

		System.out.println(max);
	}
}
