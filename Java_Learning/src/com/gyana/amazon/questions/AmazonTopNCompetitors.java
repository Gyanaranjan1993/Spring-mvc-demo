package com.gyana.amazon.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonTopNCompetitors {

	public static void main(String[] args) {

		List<String> competitors = Arrays.asList("aa", "bb", "cc");
		List<String> reviews = Arrays.asList("bb is good", "bb is great", "aa is fantastic");

		List<String> resultSet = topNCompetitors(5, 2, competitors, 6, reviews);
		System.out.println(resultSet);

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static List<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
			int numReviews, List<String> reviews) {

		Map<String, Integer> resultSet = new HashMap<>();

		// ArrayList<String> resultSet = new ArrayList<>();

		for (String a : competitors) {
			resultSet.put(a, 0);

		}

		for (String competitor : competitors) {

			for (int position = 0; position < reviews.size(); position++) {

				if (reviews.get(position).toLowerCase().contains(competitor.toLowerCase())) {

					resultSet.put(competitor, resultSet.get(competitor) + 1);

				}

			}
		}

		// POPULATE RESULTSET DEPENDING UPON THE reviewCounter ARRAY
		ArrayList<String> ls = new ArrayList<>(resultSet.keySet());
		Collections.sort(ls, (a, b) -> (resultSet.get(a)).equals(resultSet.get(b)) ? a.compareTo(b)
				: resultSet.get(b) - resultSet.get(a));

		return ls.subList(0, topNCompetitors);
		// WRITE YOUR CODE HERE
	}
	// METHOD SIGNATURE ENDS
}