package com.gyana.inheritance.basics;

public class NestedInheritance {

	public static void main(String[] args) {

		String text = "ForfeffeeF";
		String modifiedText = modifyString(text);

		System.out.println(modifiedText);

	}

	private static String modifyString(String text) {
		// TODO Auto-generated method stub

		String modified = text.replace("F", "KF").replace("f", "Kf");
		return modified;
	}

}
