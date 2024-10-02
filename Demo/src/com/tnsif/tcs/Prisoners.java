package com.tnsif.tcs;

import java.util.Scanner;

public class Prisoners {
	public static void main(String[] args) {
		int nop, nos;
		int start;
		int t;

		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();		
		int ans;
		while (t != 0) {
			nop = sc.nextInt();
			nos = sc.nextInt();
			start = sc.nextInt();
			ans = (nos + start - 1) % nop;
			System.out.println(ans>0?ans:nop);
			t--;
		}
	}
}
