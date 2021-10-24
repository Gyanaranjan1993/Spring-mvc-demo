package com.gyana.design.patterns.factory;

public class OperatingSystemFactory {

	public OS getOS(String str) {

		switch (str) {
		case "android":
			return new AndroidOS();
		case "apple":
			return new Ios();
		default:
			return null;
		}
	}

}
