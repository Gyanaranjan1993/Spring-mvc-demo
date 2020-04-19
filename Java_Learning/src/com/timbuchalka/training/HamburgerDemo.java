package com.timbuchalka.training;

public class HamburgerDemo {

	public static void main(String[] args) {

		Hamburger h = new Hamburger("Brown", "Chicken", true, true, false, true);

		System.out.println(" The base price is :" + h.getBasePrice() + "$");

		// h.setIfCarrot(true);
		// h.setIfLettuce(true);

		System.out.println(" The Final price is :" + h.finalPrice() + "$");

		HealthyBurger a = new HealthyBurger("Chicken", true, true, false, true, true, true);

		a.setBreadType("honeywheat");

		// System.out.println(a.toString());
		// System.out.println("The Final price of healthy burger is " + a.finalPrice());
	}

}
