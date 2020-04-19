package com.gyana.method.basics;

public class MethodBasics {

	/*
	 * Allowable declarations the method should be having a return type access
	 * modifier should be before the return type optional specifier should be at any
	 * place but before the return type
	 * 
	 */

	public void display() {
	};

	void display1() {
	};

	static void display3() {
	};

	static final void display4() {
	};

	final static void display5() {
	};

	final static public void display6() {
	};

	static final public void display7() {
	};

	/*
	 * non-allowable types
	 */

	// void public display9() {};
	// public display10() {};
	// public void int display10() {};
	// display11(){};
	// void static display12() {};

}
