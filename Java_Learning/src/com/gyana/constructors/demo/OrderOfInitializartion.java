package com.gyana.constructors.demo;

public class OrderOfInitializartion {

	private static int firstNumber = 1;

	{
		System.out.println("First coming here" + firstNumber);
		firstNumber += firstNumber;
	}

	{
		System.out.println("Coming to the 2nd Default initialization");
		firstNumber += firstNumber;
	}

	static {

		System.out.println("Coming in the static loop" + firstNumber);
		firstNumber += firstNumber;
	}

	public OrderOfInitializartion() {

		System.out.println("Coming to the constructor" + firstNumber);

	}

	public static void main(String[] args) {
		new OrderOfInitializartion();
	}

}
