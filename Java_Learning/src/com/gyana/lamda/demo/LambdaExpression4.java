package com.gyana.lamda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpression4 {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Gyan", 25, 25000));
		persons.add(new Person("Saquib", 35, 30000));
		persons.add(new Person("Sujit", 45, 40000));

		check(persons, (p -> p.getAge() < 30));
		check(persons, (person -> person.getAge() < 45));
		check(persons, (p -> p.getName().startsWith("G") || p.getName().startsWith("R")));

	}

	private static void check(List<Person> persons, Predicate<Person> filter) {

		for (Person p : persons) {
			if (filter.test(p)) {
				System.out.println("The Person name " + p.getName());
			}

		}

	}

}
