package com.gyana.basics;

public class VariableScope {
	
	static private int myNewInt = 5;
	
	public static void main(String[] args) {
		int myLocalInt = 10;
		
		{
			int myOtherInt = 15;
			System.out.println("MyOtherInt = " + myOtherInt);
			System.out.println("myNewInt from the code block =" + myNewInt);
			System.out.println("myLocalInt from the code block= " + myLocalInt);
		}
		
		
		System.out.println("--Printing from outside the block------");
		
		// Can not access the variable declared inside the code block outside
		//System.out.println("myOtherInt = " + myOtherInt);
		System.out.println("MyLocalInt = " + myLocalInt);
		System.out.println("MyNewInt="+ myLocalInt);
		
		//Now defined the same variable as a local
		int myOtherInt = 25;
		System.out.println("myOtherInt = " + myOtherInt);
		
		
		
		
	}

}
