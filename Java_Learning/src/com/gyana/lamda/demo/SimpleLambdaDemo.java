package com.gyana.lamda.demo;

//Lambda expressions basically express instances of functional interfaces(An interface with single abstract method is called functional interface. 
//An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces

//Java program to demonstrate lambda expressions to implement a user defined functional interface. 

//A sample functional interface (An interface with 
//single abstract method 
interface FuncInterface {
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun() {
		System.out.println("Hello");
	}
}

class SimpleLambdaDemo {
	public static void main(String args[]) {
		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		FuncInterface fobj = (int x) -> System.out.println(2 * x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);
	}
}
