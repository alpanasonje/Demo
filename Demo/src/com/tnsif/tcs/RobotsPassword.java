package com.tnsif.tcs;

import java.util.Scanner;

public class RobotsPassword {
	static String checkPassword(String password) {
		String answer = "Invalid password, try again";
		String exp = "\\w+\\d+";
		if (password.length() >= 6) {
			if (password.indexOf(" ") == -1 && password.indexOf("/") == -1 && 
					password.matches(exp))
				return "password valid";
		}
		return answer;
	}

	public static void main(String[] args) {
		String password;
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		sc.nextLine();
		while (t > 0) {
			password = sc.nextLine();
			System.out.println(checkPassword(password));
			t--;
		}
	}
}
