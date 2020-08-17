package com.timbuchalka.training;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {

		int numArray[] = new int[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 5 numbers only 1 by one");

		for (int i = 0; i < numArray.length; i++) {

			numArray[i] = scanner.nextInt();
		}

		System.out.println("Entered Array of numbers are :" + Arrays.toString(numArray));

		int sortedArray[] = sortedArray(numArray);

		System.out.println("Sorted array of numbers are :" + Arrays.toString(sortedArray));

		scanner.close();

	}

	public static int[] sortedArray(int[] x) {

		// int sortedArray[] = x;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {

					int a = x[i];
					x[i] = x[j];
					x[j] = a;
				}
			}

		}

		return x;
	}
}
