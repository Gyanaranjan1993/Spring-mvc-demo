package com.gyana.array.basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(3); // Java uses autoboxing to automatically convert int to Integer.

		int a = list.get(0); // Java uses unboxing to convert Integer to int.

	}

}
