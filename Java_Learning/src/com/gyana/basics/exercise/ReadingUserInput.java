package com.gyana.basics.exercise;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {

		readInput();
	}

	public static void readInput() {

		Scanner scanner = new Scanner(System.in);

		int counter = 1;
		int sum = 0;

		while (counter <= 10) {

			System.out.print("Enter number " + counter + " :");
			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
			} else {
				System.out.println("invalid Number");
			}
			scanner.nextLine();
		}
		scanner.close();
		System.out.println("The Sum of 10 valid numbers is " + sum);
	}

}
