package com.gyana.array.basics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(4);
		a.add(6);
		a.add(1);
		a.add(2);

		System.out.println(a);

		Collections.sort(a);
		System.out.println(a);

		int index = Collections.binarySearch(a, 6);

		System.out.println(index);

	}

}
