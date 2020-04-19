package com.gyana.constructors.demo;

class SpecialString {
	String str;

	SpecialString(String str) {
		this.str = str;
	}
}

public class ConstructorsDemo {

	public static void main(String[] args) {

		System.out.println(new String("Java"));
		System.out.println(new StringBuilder("Java"));
		System.out.println(new SpecialString("Java"));

		StringBuilder sb = new StringBuilder("Java");
		String s1 = sb.toString();
		String s2 = s1;

		System.out.println(s1 == s2);
	}

	/*
	 * Constructors are used to initialize state of an object The name has to be
	 * same as of the class name Constructors does not have a return type
	 * Constructors are invoked implicitly default constructors are provided by Java
	 * if there is no constructors defined The purpose of a constructor is to create
	 * an instance of a class Constructors are not accessible by inherited classes
	 * but methods can be accessible
	 */

}
