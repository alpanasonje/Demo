package com.tnsif.tcs;

import java.util.Scanner;

public class BitCalculator {
	public static void main(String[] args) {
		int n, no, bits = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n > 0) {
			no = sc.nextInt();
			while (no != 0) {
				bits += no % 2;
				no = no / 2;
			}
			n--;
		}
		System.out.println(bits);
	}
}
