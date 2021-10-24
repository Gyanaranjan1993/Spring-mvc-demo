package com.gyana.design.patterns.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton singleton = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return singleton;
	}

	public static void display() {

		System.out.println("Njoy the singleton design");
	}

}
