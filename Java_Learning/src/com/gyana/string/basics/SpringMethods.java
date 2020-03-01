package com.gyana.string.basics;

public class SpringMethods {
	
	public static void main(String[] args) {
			
		String str = "Gyana Mohanty";
		
		//length
		
		System.out.println("length = " + str.length());
		
		//char at
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		
		//Below will throw Java string out of bound exception
		//System.out.println(str.charAt(13));
		
		//indexOf method
		
		//below will print the index of very first character - A
		System.out.println(str.indexOf('M'));
		System.out.println(str.indexOf('M', 4));
		
		//substring
		System.out.println(str.substring(3,8));
		
		//returns empty string
		System.out.println(str.substring(3,3));
		
		//throws index out of bound exception
		//System.out.println(str.substring(4,2));
		
		
		//tolowercase
		System.out.println("abCd".toUpperCase());
		
		//this below will not change the value of str as its immutable
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		
		
		
	}

}
