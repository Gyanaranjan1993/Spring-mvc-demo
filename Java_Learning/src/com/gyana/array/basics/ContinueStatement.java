package com.gyana.array.basics;

/*
 * A continue statement basically skips all the codes after the continue statement and control is passed to the loop;
 */
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals = { "Lizard", "Cricket", "Bat", "Frog", "Dog" };

		for (String animal : animals) {
			if (animal.contentEquals("Cricket")) {
				continue;
			}

			System.out.println(animal);
		}

		System.out.println("Continue loop ended");
	}

}
