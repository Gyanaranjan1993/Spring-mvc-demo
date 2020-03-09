package com.gyana.array.basics;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator is used for looping through various collection classes like HashMap, LinkedList, ArrayList
 * Iterator is considered better over for loop and for each loop because of following
 * 1. Can iterate forward and backward
 * 2. Can remove elements
 * 3. Ability to check more elements using hasNext()
 * 4. Iterator has more advantage, as it remembers where u are in the data structure and in case of accessing using index,
 *    everytime the list goes to first element and traverses
 * 
 * If you just want to iterate over a collection, for-each is enough. if you want to more operation then 
 * Iterator is beneficial.
 */

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(6);
		a.add(1);
		a.add(2);

		for (Integer i : a) {
			System.out.println(i);

			// below throws concurrentmodification exception
			// a.remove(i);
		}

		for (Iterator<Integer> iterator = a.iterator(); iterator.hasNext();) {
			Integer n = iterator.next();
			System.out.print(n);

		}
	}

}
