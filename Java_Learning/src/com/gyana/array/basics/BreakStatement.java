package com.gyana.array.basics;

/*
 * Break Statement will cause the loop to break and continue to the next execution after end of scope
 */

public class BreakStatement {

	public static void main(String[] args) {

		String[] animals = { "Lizard", "Cricket", "Bat", "Frog", "Dog" };

		for (String animal : animals) {
			if (animal.contentEquals("Cricket")) {
				break;
			}

			System.out.println(animal);
		}

		System.out.println("Break loop ended");
	}

}
