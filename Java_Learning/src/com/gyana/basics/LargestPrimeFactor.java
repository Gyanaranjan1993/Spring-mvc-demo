package com.gyana.basics;

public class LargestPrimeFactor {

	public static int findLargestPrimeFactor(int num) {

		int result = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result = i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int z = findLargestPrimeFactor(15);

		System.out.println(z);
	}
}
