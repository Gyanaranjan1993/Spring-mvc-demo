package com.gyana.basics.exercise;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		inputThenPrintSumAverage();
	}

	public static void inputThenPrintSumAverage() {

		Scanner scanner = new Scanner(System.in);
		boolean first = true;
		int sum = 0;
		double average = 0;
		int counter = 0;

		System.out.println("Input a character anytime to terminate the program");
		while (true) {

			if (first)
				System.out.print("Enter 1st number :");
			else
				System.out.print("Enter next number");

			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int num = scanner.nextInt();
				if (first) {
					System.out.println("this is first time, so enter next number to see average or sum");
					first = false;
				}
				counter += 1;
				sum += num;
				average = sum / counter;
				System.out.println("The sum is " + sum);
				System.out.println("Average is " + Math.round(average));

			} else {
				System.out.println("Invalid Number, please start over");
				break;
			}
			scanner.nextLine();
		}

		scanner.close();
	}
}
