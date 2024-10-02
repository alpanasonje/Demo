//Program to demonstrate division operation using exception handling
package com.tnsif.exceptionhandling;

public class UsingExceptionHandling {
    public static void main(String[] args) {
        int dividend = 10;
        int[] divisors = {2, 0, 5}; // Divisors including a zero for division by zero scenario

        for (int divisor : divisors) {
            try {
                int result = dividend / divisor;
                System.out.println("Result of division: " + dividend + " / " + divisor + " = " + result);
            } catch (ArithmeticException e) {
                System.err.println("Error: Division by zero occurred.");
            }
        }
    }
}
