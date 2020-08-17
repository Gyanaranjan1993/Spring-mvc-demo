package com.gyana.amazon.questions;

import java.util.ArrayList;
import java.util.Arrays;
//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;

//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class EightHomeStatusSolution {

	public static void main(String[] args) {

		int[] homeNumbers = new int[] { 1, 1, 1, 0, 1, 1, 1, 1 };

		List<Integer> resultSet = cellCompete(homeNumbers, 2);

	}

// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static List<Integer> cellCompete(int[] states, int days) {
		// WRITE YOUR CODE HERE

		int[] oldState = Arrays.copyOf(states, 8);
		List<Integer> resultSet = new ArrayList<>();

		while (days > 0) {

			// perform the update logic here.

			for (int position = 0; position < states.length; position++) {

				if (position == 0) {
					if (oldState[1] == 1)
						states[0] = 1;
					else
						states[0] = 0;
				} else if (position == states.length - 1) {

					if (oldState[states.length - 2] == 1)
						states[position] = 1;
					else
						states[position] = 0;
				} else {

					if ((oldState[position - 1] == 0 && oldState[position + 1] == 0)
							|| (oldState[position - 1] == 1 && oldState[position + 1] == 1)) {

						states[position] = 0;

					} else {

						states[position] = 1;
					}

				}
			}
			oldState = Arrays.copyOf(states, 8);
			days = days - 1;

		}

		for (int i : states) {

			resultSet.add(i);
		}

		return resultSet;

	}
// METHOD SIGNATURE ENDS
}
