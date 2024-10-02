package com.demo;

public class CmdLineArgumentsDemo {

	public static void main(String[] args) {
		System.out.println(args.length);
		//System.out.println(args[0]);
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);

	}

}
