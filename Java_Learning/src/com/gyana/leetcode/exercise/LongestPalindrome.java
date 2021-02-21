package com.gyana.leetcode.exercise;

/*Longest Palindrome*/

/*
 * abccba
 * 
 * 
 * 
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = findLargestPalindrome("abcdcb");

		if (result == null) {

			System.out.println("No PalinDrome Found");
		} else {

			System.out.println("The PalinDrome is " + result);
		}

	}

	public static String findLargestPalindrome(String string) {

		if (string.equals(new StringBuilder(string).reverse().toString())) {

			return string;
		}

		String intermediateX = null;
		String intermediateX2 = null;

		boolean findPalindrome = false;

		for (int i = string.length() - 1; i >= 2; i--) {

			intermediateX = string.substring(0, i);
			System.out.println("intermediateX is " + intermediateX);

			if (intermediateX.equals(new StringBuilder(intermediateX).reverse().toString())) {
				System.out.println("Inside first if" + intermediateX);
				findPalindrome = true;
				break;
			}

			System.out.println(intermediateX);

		}

		for (int i = 1; i < string.length() - 1; i++) {

			intermediateX2 = string.substring(i, string.length());
			System.out.println("intermediateX2 is " + intermediateX2);
			System.out.println("Reverse X2 is" + new StringBuilder(intermediateX2).reverse().toString());

			if (intermediateX2.equals(new StringBuilder(intermediateX2).reverse().toString())) {

				System.out.println("Inside intermediateX2 is " + intermediateX2);
				findPalindrome = true;
				break;
			}

		}

		System.out.println(findPalindrome);

		if (findPalindrome) {

			if (intermediateX.length() > intermediateX2.length()) {

				return intermediateX;
			} else {

				return intermediateX2;
			}

		} else {
			return null;
		}

	}

}
