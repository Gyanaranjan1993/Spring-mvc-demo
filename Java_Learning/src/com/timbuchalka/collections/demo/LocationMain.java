package com.timbuchalka.collections.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocationMain {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		locations.put(0, new Location(0, "You are back in home"));
		locations.put(1, new Location(1, "Roanoke"));
		locations.put(2, new Location(2, "Richmond"));
		locations.put(3, new Location(3, "Bedford"));
		locations.put(4, new Location(4, "Alexandria"));
		locations.put(5, new Location(5, "Forest"));

		// adding map to 1st location

		locations.get(1).addExit("W", 2);
		locations.get(1).addExit("E", 3);
		locations.get(1).addExit("S", 4);
		locations.get(1).addExit("N", 5);

		locations.get(2).addExit("N", 5);

		locations.get(3).addExit("W", 1);

		locations.get(4).addExit("N", 1);
		locations.get(4).addExit("W", 2);

		locations.get(5).addExit("S", 1);
		locations.get(5).addExit("W", 2);

		Map<String, String> vocab = new HashMap<String, String>();
		vocab.put("QUIT", "Q");
		vocab.put("NORTH", "N");
		vocab.put("SOUTH", "S");
		vocab.put("WEST", "W");
		vocab.put("EAST", "E");

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getLocationID() + "->" + locations.get(loc).getDescription());
			if (loc == 0) {
				break;
			}
			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.println("Available exits are");

			for (String exit : exits.keySet()) {
				System.out.print(exit + ",");
			}

			System.out.println();

			String direction = scanner.nextLine().toUpperCase();

			if (direction.length() > 1) {
				String[] words = direction.split(" ");

				for (String word : words) {
					if (vocab.containsKey(word)) {
						direction = vocab.get(word);
						break;
					}
				}
			}

			if (exits.containsKey(direction)) {
				loc = exits.get(direction);
			} else {
				System.out.println("You can not go in that direction");
			}

		}
	}

}
