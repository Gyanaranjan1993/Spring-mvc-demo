package com.gyana.array.basics;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {

		String[] a = { "50", "2", "3" };

		Arrays.parallelSort(a);

		System.out.println(a);

		for (String s : a) {
			System.out.println(s);
		}
	}

}
