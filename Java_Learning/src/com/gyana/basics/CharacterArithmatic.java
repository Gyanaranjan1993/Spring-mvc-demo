package com.gyana.basics;

public class CharacterArithmatic {

	public static void main(String[] args) {

		char myChar = 'a';
		char myChar2 = '1';

		System.out.println("myChar = " + myChar);
		System.out.println("myChar isLetter" + Character.isLetter(myChar));
		System.out.println("myChar isDigit" + Character.isDigit(myChar));

		System.out.println("myChar2 = " + myChar2);
		System.out.println("myChar2 isLetter" + Character.isLetter(myChar2));
		System.out.println("myChar2 isDigit" + Character.isDigit(myChar2));

		// Exam examples -- Below are some of the examples

		char letter = 65;
		int myInt = letter + 3;
		char myLetter2 = (char) myInt;

		System.out.println("MyLetter2 = " + myLetter2);

		char myLetter3 = 65;
		char myLetter4 = (char) (myLetter3 + 1);
		boolean a = myLetter4 == 'B';

		System.out.println("a is " + a);

		boolean b = myLetter4++ == 'C';

		System.out.println("b is " + b);

		boolean c = myLetter4 == 'C';

		System.out.println("C is " + c);

		boolean d = ++myLetter4 == 'D';

		System.out.println("D is " + d);

	}

}
