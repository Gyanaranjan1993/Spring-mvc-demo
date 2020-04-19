package com.java.exception.basics;

/*
 * Exception types in Java
 * There are many reasons where a code can fail in runtime. That gives Exception handling in java an important concept.
 * 
 * Checked Exception : Subclass of Exception but not subclass of runtime exception. These are required to be catched and required to be handled.
 *                     Checked exceptions should be handled by program itself otherwise it wont be compiled. 
 * Unchecked Exception : subclass of runtime exception. These are OK to catch but not handled in the class. e.g. Arithmatic exceptions.
 *                       These are not programmed in the code and the compiler wont fail. but during execution the code fails. 
 * Error : Subclass of error. These are the catched and not handled in the class. 
 */

public class ExceptionDemo {

	public static void main(String[] args) {

		// it throws an arithmatic exception in runtime so its an unchecked exception.
		int x = divide(3, 0);
		System.out.println(x);
	}

	public static int divide(int a, int b) {

		int c = a / b;
		return c;
	}

}
