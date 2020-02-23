package com.gyana.basics;

/* 8 built in data types
 * boolean - no size
 * byte - 8 bits
 * short - 16 bits - 2 bytes
 * int - 32 bits - 4 bytes
 * long - 64 bits - 8 bytes
 * float - 32 bits - 4 bytes
 * double - 64 bits - 8 bytes
 * char - 16 bits - 2 bytes
 * 
 * */

public class PrimitivesDemo {
	public static void main(String[] args) {
		short a = 128;
		long max = 337_47_474_74747L;

		// Can not type underscores at the beginning
		// Long a1 = _222;

		// octal number

		int oct = 010;

		System.out.println(a);
		System.out.println(max);
		System.out.println(oct);
		System.out.println(Integer.toOctalString(oct));

		// -------------Hexa decimals 0-9 , A-F, starts with 0x

		int hex1 = 0xF;
		int hex2 = 0x1E;

		System.out.println("hex 1 " + hex1 + "hex2 " + hex2);
		System.out.println("In hexadecimals " + "Hex 1 " + Integer.toHexString(hex1));

		// -------------Binary - starts with 0b

		int bin1 = 0b1001;
		int bin2 = 0b1011;

		System.out.println("Bin1 " + bin1 + "bin2 " + bin2);
		System.out.println("In binary" + "Bin1 " + Integer.toBinaryString(bin1));
		
		
		// Decimal Numbers always follow double
		// float f1 = 25.4 ; this line gives error because of incompatible types, as java always assumes it as double
		// float f1 = 25.4f; this is correct
		
		/* Formatting : - Can not put underscore just after or just before the decimal
		 * _10.56 or 10._56, 10_.56, 10.56_ - will not compile 
		 * 
		 */
		
		double f1 = 25.4;
		System.out.println("f1:--" + f1);
		
		/*
		 * Chars :- 2 bytes
		 */
		
		char a1 = 'a';
		char a2 = '\u03A9'; //uppercase greek omega
		
		System.out.println("a1:--" + a1 + "a2:--" + a2);
	}

}
