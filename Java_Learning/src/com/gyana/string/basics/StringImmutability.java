package com.gyana.string.basics;


/*
 * Immutabiity : It basically tells that an object can not be changed once created. everytime a new object reference will 
 * be created when the value of the object is changed.
 * 
 * Immutable objects can be garbage collected like other objects
 */
public class StringImmutability {
	
	public static void main(String[] args) {
		
		String hello = "hello";
		String hi = hello + "world";
		
		hi = hello;
		
		System.out.println(hi + hello);
		//prints hello hello
		
	    //----------------Concat----------------------------------------------------
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		
		//----------------------------------------------------
		
		System.out.println(s1);
		System.out.println(s2);
		
		//----------------------------------------------------
		
	}

}
