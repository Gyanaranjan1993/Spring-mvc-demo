package com.gyana.basics;

public class NumericPromotion {
	
	/*
	 * Numeric promotion : Whenever we do any mathematical operation with a smaller data type to a larger data type then 
	 * Java automatically promotes the smaller data type to the larger one.
	 * 
	 * Casting : This is not automatic. This basically says converting larger data type to smaller data type
	 * 
	 * Byte, Short ,Long Gets automatically converted into Int whenever they are involved in mathematical operation. 
	 * 
	 * conversion automatically happens to the larger data type involved in the operation.
	 */

	public static void main(String[] args) {
		
		//Auto promotion example
		int x = 1;
		double y = 20.55;
		
		System.out.println("X + Y = " + (x+y));
		
		//Casting Example
		double myDouble = 10.55;
		int z = (int) (4 + myDouble);
		
		System.out.println("Z = " + z);
		
		int myInt1 = 5;
		double myDouble1 = 10.55;
		short myShort = 15;
		
		//Sum will require a cast if it is of type int
		int sum = (int) (myInt1 + myDouble1 + myShort);
		
		//Sum will not require a cast if it is of type double
		double sum1 = myInt1 + myDouble1 + myShort;
		
		System.out.println("SUM = " + sum + " SUM1 = " + sum1);

		
	}
}
