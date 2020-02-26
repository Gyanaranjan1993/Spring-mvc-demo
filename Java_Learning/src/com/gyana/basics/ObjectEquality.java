package com.gyana.basics;

public class ObjectEquality {
	
	public static void main(String[] args) {
		
		//comparing objects
		
		Integer myInteger = 127;
		Integer mySecondInteger = 127;
		
		//the hashcodes are equal if the range is from -128 to 127. The hashcodes will be different if the numbers are beyond this range
		
		
		System.out.println("Myinteger hash " + System.identityHashCode(myInteger));
		System.out.println("MySecondinteger hash " + System.identityHashCode(mySecondInteger));
		
		System.out.println(myInteger == mySecondInteger);
		
		myInteger = 122;
		mySecondInteger = 122;
		
		System.out.println("Myinteger hash " + System.identityHashCode(myInteger));
		System.out.println("MySecondinteger hash " + System.identityHashCode(mySecondInteger));
		

		
		myInteger = 128;
		mySecondInteger = 128;
		
		System.out.println("Myinteger hash " + System.identityHashCode(myInteger));
		System.out.println("MySecondinteger hash " + System.identityHashCode(mySecondInteger));
		
	   Integer int1 = new Integer(1);
	   Integer int2 = new Integer(1);
	   Integer int3 = 1;
	   
	   // These comparisons will be false as we are comparing object references not the values stored
	   System.out.println("int1 == int2" + (int1 == int2));
	   System.out.println("int2 == int3" + (int2 == int3));
	   System.out.println("int1 == int3" + (int2 == int3));
	   
	   
	   //These comparisons will be true as we are comparing values in the objects
	   System.out.println("int1.equals(int2)" + int1.equals(int2));
	   System.out.println("int2.equals(int3)" + int2.equals(int3));
	   System.out.println("int1.equals(int3)" + int1.equals(int3));
	   
	   
	   
	   System.out.println("Int1 hashcode " + System.identityHashCode(int1));
	   System.out.println("Int2 hashcode " + System.identityHashCode(int2));
	   System.out.println("Int3 hashcode " + System.identityHashCode(int3));
	}

}
