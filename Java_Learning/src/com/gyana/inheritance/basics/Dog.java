package com.gyana.inheritance.basics;

public class Dog extends Animal {

	public Dog(int age) {
		super(age);
		System.out.println("Instantiating the Dog");
	}

	public static void main(String[] args) {

		Dog dog = new Dog(5);
		dog.setType("Indian");

		System.out.println("The Dog type is " + dog.getType() + " and the Age is " + dog.getAge());
	}

}
