package com.timbuchalka.collections.demo;

import java.util.HashMap;
import java.util.Map;

//HashMap allows one null key and null values
//HashMap does not store the values in sorted order

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();

		languages.put("Java", "I love this language");
		languages.put("C", "First language I ever used");
		languages.put("BASIC", "Language of the 90s");

		System.out.println(languages.get("Java"));

		// the value will be overwritten if we try add the same key again
		languages.put("Java", "Object oriented language");
		System.out.println(languages.get("Java"));

		if (languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		} else {
			languages.put("Java", "Object oriented language");
		}

		// iterating over a map using KeySet
		System.out.println("========Here is the Map>>>>>>>>>>>>");
		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}

		// remove method to remove the values
		languages.remove("Java");

		System.out.println("========Here is the updated Map>>>>>>>>>>>>");
		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}

		// replace the values

		System.out.println(languages.replace("C", "Language of 80s"));
		System.out.println("========Here is the updated Map>>>>>>>>>>>>");
		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}

		// replaced can be used like this
		languages.replace("C", "Language of 80s", "Language I learnt in my college");
		System.out.println("========Here is the updated Map>>>>>>>>>>>>");
		for (String key : languages.keySet()) {
			System.out.println(key + ":" + languages.get(key));
		}
	}

}
