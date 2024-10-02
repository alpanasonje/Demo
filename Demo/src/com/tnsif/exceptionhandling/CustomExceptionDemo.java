//Program to demonstrate handling custom exception
package com.tnsif.exceptionhandling;

//Define custom Exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
	//validate age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
        	//throwing custom exception
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            int valueOne = 10, valueTwo=-10;
            checkAge(valueOne);
            checkAge(valueTwo);
        } catch (InvalidAgeException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
