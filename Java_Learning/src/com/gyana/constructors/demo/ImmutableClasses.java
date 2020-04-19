package com.gyana.constructors.demo;

/*
 * Immutable classes have all the variables final
 * Immutable classes does not have setters, only getters
 * Immutability prevents to change the variables of the current instance, Everytime its required to create a new instance.
 * 
 */
public class ImmutableClasses {

	private final int a;
	private final int b;

	public ImmutableClasses(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public ImmutableClasses plus(ImmutableClasses i) {
		int x = a + i.a;
		int y = b + i.b;
		return new ImmutableClasses(x, y);
	}

	public static ImmutableClasses plus(ImmutableClasses i, ImmutableClasses j) {
		// int x1 = i.a + j.a;
		// int y1 = i.b + j.b;
		return i.plus(j);

	}

	public static void main(String[] args) {

		ImmutableClasses immutableClasses = new ImmutableClasses(1, 2);
		ImmutableClasses immutableClasses1 = immutableClasses.plus(new ImmutableClasses(2, 3));
		ImmutableClasses immutableClasses2 = ImmutableClasses.plus(immutableClasses, immutableClasses1);

		System.out.println("Sum A = " + immutableClasses1.a + "Sum B " + immutableClasses1.b);
		System.out.println("2nd Sum A = " + immutableClasses2.a + "Sum B " + immutableClasses2.b);
	}

}
