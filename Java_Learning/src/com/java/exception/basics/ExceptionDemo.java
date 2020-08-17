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

/*Types of inbuilt exceptions:
	ArithmeticException
	  It is thrown when an exceptional condition has occurred in an arithmetic operation.
	ArrayIndexOutOfBoundsException
	  It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.
    ClassNotFoundException
	  This Exception is raised when we try to access a class whose definition is not found
	FileNotFoundException
	  This Exception is raised when a file is not accessible or does not open.
	IOException
	  It is thrown when an input-output operation failed or interrupted
	InterruptedException
	  It is thrown when a thread is waiting , sleeping , or doing some processing , and it is interrupted.
	NoSuchFieldException
	  It is thrown when a class does not contain the field (or variable) specified
	NoSuchMethodException
	  It is thrown when accessing a method which is not found.
	NullPointerException
	  This exception is raised when referring to the members of a null object. Null represents nothing
	NumberFormatException
	  This exception is raised when a method could not convert a string into a numeric format.
	RuntimeException
	  This represents any exception which occurs during runtime.
	StringIndexOutOfBoundsException
	  It is thrown by String class methods to indicate that an index is either negative than the size of the string*/

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
