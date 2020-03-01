package com.gyana.string.basics;

public class StringMethods2 {
	public static void main(String[] args) {
		
		String str = "java";
		String str2 = "Java";
		String str3 = "ja";
		
		//equals and equalsIgnoreCase
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		//startsWith
		
		System.out.println(str.startsWith("ja"));
		System.out.println(str.startsWith("J"));
		System.out.println(str.startsWith(str3));
		
		//contains
		System.out.println(str.contains("ja"));
		System.out.println(str.contains("va"));
		System.out.println(str.contains("av"));
		
		//replace
		String str4 = "Java" + " " + "is" + " " + "fun";
		System.out.println(str4.replace('a', 'A'));
		System.out.println(str4.replace("fun", "cool"));
		//str4 will be the same as str4 is immutable
		System.out.println(str4);
		
		
		//trim
		System.out.println(str4.trim());
		System.out.println("java is fun ".trim());
	
		
		
		
	}

}
