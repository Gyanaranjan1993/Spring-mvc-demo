package com.gyana.array.basics;

import java.util.Arrays;

public class ArrayEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animals = {"Parrot","Dog","Cat"};
		
		String[] myAnimals = animals;
		
		String[] otherAnimals = {"Parrot" , "Dog", "Cat"};
		
		System.out.println("animals == myAnimals " + (animals.equals(myAnimals)));
		System.out.println(animals == myAnimals);
		System.out.println(Arrays.equals(animals, myAnimals));
		
		System.out.println(animals.equals(otherAnimals));
		System.out.println(Arrays.equals(animals, otherAnimals));
		
		

	}

}
