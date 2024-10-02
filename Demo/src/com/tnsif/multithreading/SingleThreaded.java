/*Program to perform two task 
1)Check whether number is even or not? 
2) Display factorial of given number
*/

package com.tnsif.multithreading;
public class SingleThreaded {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" :\tIs 5 Even? " + Operations.isEven(5));

		System.out.println(Thread.currentThread().getName()+" :\tFactorial of 5 is " + Operations.getFactorial(5));		
	}
}
