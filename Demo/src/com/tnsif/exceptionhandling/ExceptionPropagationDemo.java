//Program to demonstrate exception propagation
package com.tnsif.exceptionhandling;

import java.io.IOException;
public class ExceptionPropagationDemo {
    public static void method1() throws IOException {
        System.out.println("Inside method1");
        //exception raised and forwarded to method2
        throw new IOException("IOException occurred");
    }

    public static void method2() {
        try {
            method1(); 
        } catch (IOException e) {
            System.err.println("IOException caught in method2: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        method2();
    }
}


