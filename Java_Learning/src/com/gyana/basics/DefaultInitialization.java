package com.gyana.basics;

public class DefaultInitialization {
	
	static byte myByte;
	static short myShort;
	static int myInt;
	static float myFloat;
	static long myLong;
	static double myDouble;
	static boolean myBoolean;
	static char myChar;
	
	public static void main(String[] args) {
		System.out.println("myByte = " + myByte);
		System.out.println("myShort = " + myShort);
		System.out.println("myInt = " + myInt);
		System.out.println("myFloat = " + myFloat);
		System.out.println("myLong = " + myLong);
		System.out.println("myDouble = " + myDouble);
		System.out.println("myBoolean = " + myBoolean);
		System.out.println("myChar = " + myChar);
	}
	
	/*
	 * Local variables does not get initialized. So if we try to use them inside a method without
	 * initializing then the code fails to compile.
	 */
	public static void display() {
		
		//The below does not compile....
		int x;
		//System.out.println("X is not initialized, default values is " + x);
	}

}
