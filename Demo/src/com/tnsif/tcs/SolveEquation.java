package com.tnsif.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SolveEquation {

	public static void main(String[] args) {
		Integer arr[];
		String input;
		/*
		 * String[] ch;
		 * 
		 * Scanner sc=new Scanner(System.in); input=sc.nextLine(); ch=input.split(" ");
		 * List<Integer> numList=new ArrayList<Integer>(); for(String
		 * s:input.split(" ")) numList.add(Integer.parseInt(s));
		 * 
		 * 
		 * Stream<Integer> numStream=numList.stream(); String s="x*x";
		 * numStream.map((x)->x+"*"+x).forEach(System.out::println);
		 * 
		 * }
		 */
		int[] array = { 2, 3, 4, 5, 1 };
		String[] equations = { "x*x", "x+x", "3*x+x" };

		solveEquations(array, equations);

		System.out.println("Output:");
		System.out.println(Arrays.toString(array));
	}

	public static void solveEquations(int[] array, String[] equations) {
		for (String equation : equations) {
			String[] parts = equation.split("\\*|\\+");
			int result = 0;
			for (String part : parts) {
				if (part.equals("x")) {
					result += array[0];
				} else {
					int value = Integer.parseInt(part);
					result += value;
				}
			}
			for (int i = 0; i < array.length; i++) {
				array[i] = result * array[i];
			}
		}
	}
}
