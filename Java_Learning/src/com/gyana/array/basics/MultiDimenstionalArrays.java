package com.gyana.array.basics;

public class MultiDimenstionalArrays {

	public static void main(String[] args) {

		// valid array declarations

		int[] number[] = { { 1, 2 }, { 2, 3 } };
		int number1[][] = { { 1, 2 }, { 2, 3 } };
		int[][] number2 = { { 1, 2 }, { 2, 3 } };

		// Its mandatory to provide the size of first dimenstion when initializing
		// Below will not work as we are not providing size of 1st dimension;

		// int[] num[] = new int[][];

		int[] num2[] = new int[5][];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(number[i][j]);
			}

			System.out.println("\n");
		}

		int count = 0;

		OUTER_LOOP: for (int r = 1; r <= 3; r++) {
			for (int c = 1; c < 2; c++) {

				if (r * c % 2 == 0) {
					continue OUTER_LOOP;
				}
				count++;
			}

		}
		System.out.println(count);

	}

}
