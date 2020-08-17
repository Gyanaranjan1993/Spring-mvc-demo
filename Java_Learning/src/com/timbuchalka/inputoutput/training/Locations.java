package com.timbuchalka.inputoutput.training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {

		try (BufferedWriter locFile = new BufferedWriter(new FileWriter("C:\\Users\\gyana\\Desktop\\locations.txt"));
				BufferedWriter dirFile = new BufferedWriter(
						new FileWriter("C:\\\\Users\\\\gyana\\\\Desktop\\\\directions.txt"))) {
			for (Location location : locations.values()) {
				locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
				for (String direction : location.getExits().keySet()) {
					dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction)
							+ "\n");
				}
			}
		}

	}

	static {

		Scanner scanner = null;

		try {
			scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\gyana\\Desktop\\locations_big.txt")));
			scanner.useDelimiter(",");
			while (scanner.hasNextLine()) {
				int loc = scanner.nextInt();
				scanner.skip(scanner.delimiter());
				String description = scanner.nextLine();
				System.out.println("Imported loc " + loc + ":" + description);
				Map<String, Integer> tempExit = new HashMap<>();
				locations.put(loc, new Location(loc, description, tempExit));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

		// Now Read the exits

		try {
			scanner = new Scanner(new BufferedReader(new FileReader("C:\\Users\\gyana\\Desktop\\directions_big.txt")));
			scanner.useDelimiter(",");
			while (scanner.hasNextLine()) {
				int loc = scanner.nextInt();
				scanner.skip(scanner.delimiter());
				String direction = scanner.next();
				scanner.skip(scanner.delimiter());
				String dest = scanner.nextLine();
				int destination = Integer.parseInt(dest);
				System.out.println(loc + ":" + direction + "," + destination);
				Location location = locations.get(loc);
				location.addExit(direction, destination);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		// TODO Auto-generated method stub
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		// TODO Auto-generated method stub
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		// TODO Auto-generated method stub
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		locations.clear();
	}

	@Override
	public Set<Integer> keySet() {
		// TODO Auto-generated method stub
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		// TODO Auto-generated method stub
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		// TODO Auto-generated method stub
		return locations.entrySet();
	}

}
