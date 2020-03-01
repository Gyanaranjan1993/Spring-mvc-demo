package com.gyana.basics;

public class TernaryOperator {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		
		int c = a < 10 ? a++ : b++;
		
		System.out.println("a = " + a + " b =" + b + " c= " + c);
		
	}
}
