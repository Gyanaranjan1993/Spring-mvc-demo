package com.gyana.string.basics;

public class StringMethodChaining {
	
	public static void main(String[] args) {
			
		String a = " Gyan Mohanty  ";
		
		String b = a.trim();
		System.out.println("b = " + b);
		
		String c = b.toLowerCase();
		
		System.out.println("C = " + c);
		
		String d = c.replace('y', 'Y');
		
		System.out.println("D = " + d);
		
		//All the above codes can be replaced by single chaining methods-----
		
		String e = a.trim().toLowerCase().replace('y', 'Y').toUpperCase();
		
		System.out.println("E = " + e);
		
		
	}

}
