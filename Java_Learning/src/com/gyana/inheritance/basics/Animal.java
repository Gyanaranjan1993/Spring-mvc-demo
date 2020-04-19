package com.gyana.inheritance.basics;

public class Animal {

	private String type;
	private int age;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(int age) {
		System.out.println("Instantiating the Animal class");
		this.age = age;
	}

}
