package com.gyana.amazon.questions;

import java.util.Arrays;

class GCD {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 4, 6, 8, 10 };
		int gcf = generalizedGCD(5, arr);
		System.out.println("GCF is" + gcf);

	}

	public static int generalizedGCD(int num, int[] arr) {
		// WRITE YOUR CODE HERE

		int[] sortedArray = Arrays.copyOf(arr, num);
		int gcf = 1;
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i + 1; j < sortedArray.length; j++) {
				int tmp = 0;
				if (sortedArray[i] > sortedArray[j]) {
					tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(sortedArray));
		for (int divisor = 2; divisor <= sortedArray[num - 1]; divisor++) {
			int counter = 0;
			for (int numInArray : sortedArray) {
				if (numInArray % divisor == 0)
					counter += 1;

			}
			if (counter == num)
				gcf = divisor;
		}
		return gcf;
	}
	// METHOD SIGNATURE ENDS

}
