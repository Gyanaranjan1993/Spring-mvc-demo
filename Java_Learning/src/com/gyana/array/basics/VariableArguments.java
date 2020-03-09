package com.gyana.array.basics;

/*
 * In Java 5, Varargs were included. It is used simplifies the creation of methods that takes variable number of arguments
 * Things can be avoided by using varargs 
 * -- Overloaded methods to handle diff arguments
 * -- putting variables into array and passing 'em.
 * -- we can pass as many number of arguments as we can.
 */
public class VariableArguments {

	public static void main(String... args) {

		System.out.println(args.length);

		for (String i : args) {
			System.out.println(i);
		}

		print(1, 4, 5, 6);
		print(1, 5);

	}

	public static void print(int... num) {
		int j = 0;
		for (int i : num) {

			j += i;
		}

		System.out.println("J is  " + j);
	}

}
