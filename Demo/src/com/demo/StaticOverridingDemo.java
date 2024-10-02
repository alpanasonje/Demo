package com.demo;

class Parent {
	public static void staticMethod() {
		System.out.println("Parent's static method");
	}
}

class Child extends Parent {
	//@Override //not allowed
	public static void staticMethod() {
		System.out.println("Child's static method");
	}
}

public class StaticOverridingDemo {
	public static void main(String[] args) {
		Parent p = new Child();
		p.staticMethod();
	}
}
