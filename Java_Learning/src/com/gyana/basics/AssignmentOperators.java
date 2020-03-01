package com.gyana.basics;

public class AssignmentOperators {
	public static void main(String[] args) {
		
		int a = 5;
		int c = 4;
		int z = 7;
		
		int b = a * 5 + (c=6) + (z *= 2);
		
		System.out.println("B is " + b);
		
		
		int f = 4;
		boolean g = false && (c++ < 4);
		boolean h = (c-- == 6) && !g;
		
		System.out.println("C is = " + c);
		System.out.println("G is = " + g);
		System.out.println("H is = " + h);
		
		//Question examples
		
		boolean x=true,v=true;
		int y = 20;
		
		x = (y!=10) ^ (v=false);
		
		System.out.println("X= " + x + " Y= " +y + " V= " + v);
		
	}

}
