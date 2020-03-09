package com.gyana.array.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Gyan");
		list.add("Puja");
		list.add("Pintu");

		System.out.println(list);

		// This converts the arraylist to Array
		String[] array = list.toArray(new String[list.size()]);

		System.out.println(Arrays.deepToString(array));
		array[0] = "Gyana";

		// Even if we change the array, the list wont be impacted.
		System.out.println(Arrays.deepToString(array));
		System.out.println(list);

		// Array to ArrayList

		String[] array2 = { "3", "5", "6", "8" };

		List<String> list2 = Arrays.asList(array2); // this returns a fixed size list, we can not add or remove
		System.out.println(list2);

		// Changing the array list will change the array as well.
		list2.set(0, "11");
		System.out.println(list2);
		System.out.println(Arrays.toString(array2));

		// this will throw unsupportedoperationException error
		list2.add("10");

	}

}
