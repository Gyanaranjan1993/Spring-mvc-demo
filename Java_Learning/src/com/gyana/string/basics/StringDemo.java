package com.gyana.string.basics;

public class StringDemo {
	
	public static void main(String[] args) {
		
		int three = 3;
		String four = "4";
		
		System.out.println( 1 + 2 + three + four);
		
		//another example
		
		int number = 10;
		int anotherNumber = 20;
		
		System.out.println("Result= " + (number + anotherNumber));
		
		
		/*
		 * String Equality -----
		 */
		System.out.println("<------------------------------------------------------------->");
		
		// Java searches for the string "Gyana" in the Stringpool. If its there, then it just returns the returns
		// reference to the 3 String objects. 
		
		String firstName = "Gyana";
		String secondName = "Gyana";
		String thirdName = "Gya" + "na";
		
		
		// This string object is created in java heap and returns a new reference as we are using new String.
		
		String fourthName = new String("Gyana");
		
		System.out.println("firstName == secondName " + (firstName == secondName));
		System.out.println("firstName == thirdName " + (firstName == thirdName));
		System.out.println("firstName == fourthName " + (firstName == fourthName));
		
		//But if we use equals method then all will return true because the content of the objects are true
		
		System.out.println("firstName == secondName " + (firstName.equals(secondName)));
		System.out.println("firstName == thirdName " + (firstName.equals(thirdName)));
		System.out.println("firstName == fourthName " + (firstName.equals(fourthName)));
		
		//printing the identity hash code
		
		System.out.println("firstName hash : " + System.identityHashCode(firstName));
		System.out.println("secondName hash : " + System.identityHashCode(secondName));
		System.out.println("thirdName hash : " + System.identityHashCode(thirdName));
		System.out.println("fourthName hash : " + System.identityHashCode(fourthName));
		
		
		String fifthName = "abc";
		String sixthName = "ab";
		String seventhName = "ab" + "c";
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("fifthname hash :" + System.identityHashCode(fifthName));
		System.out.println("sixthname hash :" + System.identityHashCode(sixthName));
		System.out.println("seventhname hash :" + System.identityHashCode(seventhName));
	}

}
