package com.gyana.array.basics;


/* it is much easy to use for each loop than using the length method
 * 
 */
public class UsingArrays {

	public static void main(String[] args) {

		String[] names = {"Gyan", "Maz", "Soumya", "Jayanta"};
		
		for (String name : names) {
			System.out.println("Name =" + name);
			
		}	
		
		for (String name : names) {
			name += name;
		}
		
		for (String name : names) {
			System.out.println("Name = " + name);
		}
		
		StringBuilder[] builders = {new StringBuilder("Raaz"), new StringBuilder("Rani")};
		
		for (StringBuilder builder : builders) {
			builder.append("123");
		}
		
		for (StringBuilder builder: builders) {
			System.out.println(builder);
		}
	}

}
