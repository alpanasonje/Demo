package com.tnsif.tcs;

import java.util.Scanner;
public class LiftQuery {
	public static void main(String[] args) {
		int t, call, a=0, b=7;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    while(t!=0)
	    {
	        call=sc.nextInt();
	        if (Math.abs(call-a)<=Math.abs(call-b))
	        {
	            System.out.println("A");
	            a=call;
	        }
	        else
	        {
	            System.out.println("B");
	            b=call;
	        }
	    }
	}
}
