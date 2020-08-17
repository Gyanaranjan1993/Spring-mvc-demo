package com.gyana.compare.demo;

import java.util.ArrayList;
import java.util.Collections;

public class MovieMain {

	public static void main(String[] args) {

		ArrayList<Movie> list = new ArrayList<>();

		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		RatingCompare ratingCompare = new RatingCompare();

		Collections.sort(list, ratingCompare);
		for (Movie movie : list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

		NameCompare nameCompare = new NameCompare();

		Collections.sort(list, nameCompare);
		for (Movie movie : list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

		Collections.sort(list);

		for (Movie movie : list)
			System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");

	}

}
