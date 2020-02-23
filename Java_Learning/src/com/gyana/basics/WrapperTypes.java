

package com.gyana.basics;

/*
 * Every primitive has wrapper types. It just wraps the primitive
 */
public class WrapperTypes {
	
	
    public static void main(String[] args) {
    	int Myint = 5;
    	Integer myInteger = Integer.valueOf(Myint);
    	Integer myInteger4 = Integer.parseInt("3");
    	Integer myInteger5 = null;
    	
		System.out.println("MyInt = " + Myint);
		System.out.println("myInteger = " + myInteger);
		System.out.println("myInteger4 = " + myInteger4);
		System.out.println("myInteger5 = " + myInteger5);
	}

}
