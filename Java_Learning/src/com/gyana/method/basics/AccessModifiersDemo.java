package com.gyana.method.basics;

public class AccessModifiersDemo {

	/*
	 * Access modifiers in Java public - Accessible in other classes, Packages,
	 * subclasses protected - Accessible in the class, other classes in the same
	 * package & subclasses in different package. default - Accessible in the class,
	 * other classes in the package private - Only accessible in the class
	 */

	/*
	 * Optional access specifiers static - 1. Variables and methods can be defined
	 * as static, so they can be accessed without creating an instance of the class.
	 * 2. Within static method - Can not access any other instance method or
	 * variables - Can access other static methods or static variables 3. Within
	 * instance method - Can access other static methods or variables - can access
	 * other instance methods or variables
	 * 
	 * Main purpose of static methods or variable - can be used as utility or helper
	 * methods, that does not need any instance of the object. - static variable is
	 * shared among all other instances
	 */

	private int number1;
	// -- can be used inside the class only
	int number2;
	// -- can be used inside the class & other classes in the same package
	protected int number3;
	// -- can be used inside class, other subclasses in other package & classes in
	// the same package
	public int number4;
	// -- can be used anywhere
}
