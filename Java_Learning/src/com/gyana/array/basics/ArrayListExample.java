package com.gyana.array.basics;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList internally uses list of array objects and its automatically increases the size of the arraylist
 * if we add more elements
 * Arraylist can hold different types of objects
 * ArrayList can not be declared as primitive type as they are not class. ArrayList is part of Collection class and
 * all collection classes stores the memory location of objects they collect. Primitives does not fit in this type.
 */
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This list is defined as object, so we can add any types of data to this, but
		// its not recommended
		List list = new ArrayList();

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();

		// This will not compile as the arraylist is declared of type String.
		// list3.add(5);

		list.add("Dog");
		list.add(5);

		System.out.println(list);

		list.add(0, 3);
		System.out.println(list);

		list.remove("Dog");
		list.set(0, "Cat");
		list.set(1, "Kitty");

		System.out.println(list);

		System.out.println(list.isEmpty());
		System.out.println(list.size());

		list.clear();

		System.out.println(list.isEmpty());
		System.out.println(list.size());

		list.add(0, "Cat");

		System.out.println(list.isEmpty());
		System.out.println(list.size());

		System.out.println(list.contains("Cat"));

		List<String> list4 = new ArrayList();

		list4.add("cat");

		System.out.println(list.equals(list4));

	}

}
