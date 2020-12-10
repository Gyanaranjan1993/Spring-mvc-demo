package com.gyana.collections.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		/*
		 * Arraylist is backed by Array data structure that can grow or shrink
		 * dynamically depending on number of elements.
		 * 
		 */

		// ArrayList has 3 constructors

		// This declaration creates an array of zero length in the beginning
		List<String> list1 = new ArrayList<>();

		ArrayList<String> list2 = new ArrayList<>();

		List<List<String>> list3 = new ArrayList<List<String>>();

		/*
		 * When add method is called, ArrayList checks for the array size. in this case
		 * the size is zero, ArrayList increases the size of array to 10 through grow()
		 * method.
		 * 
		 * return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
		 * 
		 * so now this arrayList has size 10 and can add upto 10 elements. for the 11th
		 * element, the arraylist will grow its size before adding the new element.
		 * 
		 * private Object[] grow(int minCapacity) { int oldCapacity =
		 * elementData.length; if (oldCapacity > 0 || elementData !=
		 * DEFAULTCAPACITY_EMPTY_ELEMENTDATA) { int newCapacity =
		 * ArraysSupport.newLength(oldCapacity, minCapacity - oldCapacity, /* minimum
		 * growth oldCapacity >> 1 preferred growth ); return elementData =
		 * Arrays.copyOf(elementData, newCapacity); } else { return elementData = new
		 * Object[Math.max(DEFAULT_CAPACITY, minCapacity)]; } }
		 */

		list1.add("Gyana");

		list1.add("puspa");

		list3.add(list1);

	}

}
