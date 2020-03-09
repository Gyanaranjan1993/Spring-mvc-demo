package com.gyana.array.basics;

import java.util.Arrays;

/* An array need to be sorted in order for binary search to work
 * 
 */

public class SearchArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 4, 7, 8, 9 };

		System.out.println(Arrays.binarySearch(numbers, 7));
		System.out.println(Arrays.binarySearch(numbers, 8));

	}

}
