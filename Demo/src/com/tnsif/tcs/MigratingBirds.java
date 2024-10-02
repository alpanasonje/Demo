package com.tnsif.tcs;
import java.util.Arrays;
import java.util.Scanner;
public class MigratingBirds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();		
		Arrays.sort(arr);
		int temp[] = new int[256];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]++;
		}
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 255; i >= 0; i--) {
			if (temp[i] == 0)
				continue;
			max = Math.max(max, temp[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (max == temp[arr[i]]) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
