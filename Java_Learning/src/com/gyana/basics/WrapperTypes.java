
package com.gyana.basics;

/*
 * Every primitive has wrapper types. It just wraps the primitive
 * The classes in Java.Util package handles only objects and hence wrapper classes help in this case also.
 * Data structures in Collection framework such as Arraylist and vector store only objects and not primitive types.
 * Wrapper classes comes under Java.util package
 * 
 */

/*
 * Autoboxing - Automatic conversion of primitive types to wrapper types
 * Unboxing - Automatic conversion of wrapper types to primitive types. 
 * 
 */

public class WrapperTypes {

	public static void main(String[] args) {
		int Myint = 5;
		Integer myInteger = Integer.valueOf(Myint);
		Integer myInteger4 = Integer.parseInt("3");
		Integer myInteger5 = null;

		System.out.println("MyInt = " + Myint);
		System.out.println("myInteger = " + myInteger);
		System.out.println("myInteger4 = " + myInteger4);
		System.out.println("myInteger5 = " + myInteger5);
	}

}
