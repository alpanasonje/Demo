package com.tnsif.tcs;

import java.util.Scanner;

public class PasswordCreation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String password = "";
		int i, j;
		for (i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
			password = password + str1.charAt(i) + str2.charAt(j);
		}
		if (i < str1.length())
			password = password + str1.substring(i, str1.length());
		if (j < str2.length())
			password = password + str2.substring(j, str2.length());
		System.out.println(password);
	}
}
