package com.java.exception.basics;

/*
 * Finally block runs every time even if there is exception or not. Finally should always be defined after Try, catch.
 * Only case when Finally statement is  not executed is when we write System.exit() in either try or catch block.
 */

public class TryCatchFinallyDemo {

	public static void main(String[] args) {

		String[] a = new String[5];
		a[0] = "Gyana";

		try {
			String element = firstToUpperCase(a);
			System.out.println(element);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block runs ");
		}

	}

	public static String firstToUpperCase(String[] array) {

		return array[0].toUpperCase();
	}

}
