/*
 * package name should always be the first line
 * the import statement can not come before that
 * variables can not be declared outside of the class
 * methods can not be declared outside of the class
 */

//this will not work because the import statement is before the package declaration
//import java.util.stream.*;

package com.gyana.basics;

import java.util.AbstractCollection;

//There can be only one public class in the file. Below will not work

//public class SecondClass{}

//but below will work

@SuppressWarnings("unused")
class SecondClass{}

public class OrderingElements {

	public void PrintMyName() {
		
		System.out.println("My name is Gyana");
		
		//We can not declare one method inside another method, but we can declare variables inside the method as well..
		
		//public void printYourName() {
		//	System.out.println("You dont have a name");
		//}
	}
}


//variables or methods can not be declared outside of a class
//public int myInt;
//public void display() {
	
//}
