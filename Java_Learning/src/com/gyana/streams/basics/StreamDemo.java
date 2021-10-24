package com.gyana.streams.basics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	/*
	 * An iterator that applies certain actions to each elements its getting from a
	 * collection
	 * 
	 * 
	 * Intermediate operations : map () filter () limit()
	 * 
	 * 
	 * 
	 * 
	 * Terminal operations
	 * 
	 * Collect() - accumulates elements into Stream and return as a collection
	 * 
	 * allMatch() anyMatch() noneMatch() count() sum()
	 * 
	 * reduce() - identity, accumulator, combiner
	 * 
	 */

	public static void main(String[] args) {

		// Collecting as List
		List<Integer> list = Arrays.asList(1, 2, 3).stream().map(i -> {
			return (i * 2);
		}).collect(Collectors.toList());

		// Collecting to LinkedList
		List<Integer> list2 = Arrays.asList(1, 2, 3).stream().map(i -> {
			return (i * 2);
		}).collect(Collectors.toCollection(LinkedList::new));

		Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
			return i * 2;
		});

		// Reduce

		Integer opt = Arrays.asList(7, 4, 6, 7).stream().reduce(0, (i1, i2) -> i1 > i2 ? i1 : i2);

	}

}
