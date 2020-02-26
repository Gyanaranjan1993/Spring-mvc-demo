package com.gyana.basics;

public class UnaryOperators {
	
	/*
	 * Unary operators are the operators which are used with only 1 variable
	 * Types : +, - , ++, --, !
	 */
	
	
	public static void main(String[] args) {
		
		
		// + operator is reduntant
		int a = +3;
		
		// denotes that its a negative number
		int b = -3;
		
		// - operator is used to negate the variable
		int c = -b;
		
		System.out.println("A = " + a + " B= " + b + " C = " + c);
		
		
		// ! used to negate the boolean variables only
		
		boolean d = true;
		boolean e = !d;
		
		System.out.println("D= " + d + " E=" + e);
		
		//++ , -- have higher order than +, -, *, /
		int f = 5;
		int g = ++f;
		
		System.out.println("F= " + f + " G=" + g);
		int h = 6;
		int i = h++;
		
		System.out.println("H= " + h + " I=" + i);
		
		System.out.println("H = " + h++ + " Now H is " + h);
		
		System.out.println("I = " + ++i);
		
		System.out.println(5/i);
		
		int j = h * 5/i - h;
		
		//8 * 5/7 - 8
		//8 * 5 - 8
		//0 - 8
		//-8
		
		System.out.println("Now J is " + j + " H is " + h + " I is " + i);
		
		
	}

}
