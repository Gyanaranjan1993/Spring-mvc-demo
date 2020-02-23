package com.gyana.basics;

public class DeclaringVariables {
	public static void main(String[] args) {
		
		//two lines
		int myInt;
		myInt = 5;
		
		//1 line
		
		int myInt2 = 10;
		
		//allowed but not good pratice
		float a1, a2, a3;
		
		//allowed	
		boolean b1; boolean b2;
		
		//incorrect
		//double d1, double d2;
		
		//incorrect
		//int i3; i4;
		
		/* 
		 * Identifiers are names for variables - can contain numbers
		 * Can not begin with numbers, 
		 * Can have only $, _ as special characters
		 * Can not have @ in the name
		 * Can not be from Reserved java keywords
		 */
		
		float okFloat;
		double $okDouble;
		double _Double;
		double _heyDouble$_123;
		
		// This is tricky, but allowed-- as Public is not of 
		double Public;
		
		//illegal;
		//double 1double;
		//float 2float;
		//double my@Street;
		
		
		
		
	}
}
