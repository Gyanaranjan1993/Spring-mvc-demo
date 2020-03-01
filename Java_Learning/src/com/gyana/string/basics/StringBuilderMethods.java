package com.gyana.string.basics;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		
		//charAt(), append(), substring()
		
		StringBuilder sb = new StringBuilder("programming");
		
		String sub = sb.substring(sb.indexOf("g"), sb.indexOf("m"));
		
		System.out.println(sb);
		System.out.println(sub);
		
		int length = sb.length();
		char ch = sb.charAt(4);
		
		System.out.println("Length of sb is = " + length);
		System.out.println("ch is = " + ch);
		
		//append();
		StringBuilder sb2 = new StringBuilder().append("b").append("c");
		System.out.println(sb2);
	
		//insert();
		StringBuilder sb3 = new StringBuilder("Programming easy");
		sb3.insert(5, "--").insert(6, "^{");
		System.out.println("sb3 is " + sb3);
		
		
		
		//Delete(), DeleteCharAt();
		//deletes starts from 1st index and ends at (3-1) index
		
		sb3.delete(1, 3);
		System.out.println("After Deleting  = " + sb3);
		
		
		//Deletes the char at the 5th index
		sb3.deleteCharAt(5);
		System.out.println("After Deleting second = " + sb3);
		
		//Below will throw outOfBoundException
		
		//sb3.delete(2, 1);
		//System.out.println(sb3);
		
		sb3.delete(1,1);
		System.out.println("SB3 is not affected and it is = " + sb3);
		
		
		//Reverse();
		sb3.reverse();
		System.out.println("After Reversing = " + sb3);
		
		//converting to string
		String myString = sb3.toString().toUpperCase();
		System.out.println(myString);
		

		
	}
	

}
