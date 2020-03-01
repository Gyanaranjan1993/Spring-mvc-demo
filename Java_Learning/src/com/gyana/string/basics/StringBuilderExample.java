package com.gyana.string.basics;

/*
 * StringBuilder is not immutable. It is used where we need to manipulate with many string and avoid creating lots of String objects
 * 
 * Java does not allows us to compare String with Stringbuilders
 * 
 */

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for (char c ='a';c <= 'z'; c++) {
			sb.append(c); // add charchters to string without creating a new string object all the time
		}
		
		System.out.println("Finally sb = " + sb);
		
		
		StringBuilder builder = new StringBuilder("start");
		builder.append(" end");
	
		//builder is not immutable, so the following will print "start end"
		System.out.println(builder);
		
		// the below statement will change both buider and secondbuilder and they will be equal
		
		StringBuilder secondBuilder = builder.append(" cycle");
		
		System.out.println(secondBuilder == builder);
		System.out.println("Builder = " + builder);
		System.out.println("SecondBuilder = " + secondBuilder);
		
		//length and capacity
		
		System.out.println("Size = " + builder.length());
		System.out.println("Capacity = " + builder.capacity());
		
	
	}

}
