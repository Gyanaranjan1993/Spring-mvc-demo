package com.timbuchalka.training;

public class HealthyBurger extends Hamburger {

	private boolean ifGuac;

	public boolean isIfGuac() {
		return ifGuac;
	}

	public void setIfGuac(boolean ifGuac) {
		this.ifGuac = ifGuac;
	}

	public boolean isIfBeef() {
		return ifBeef;
	}

	public void setIfBeef(boolean ifBeef) {
		this.ifBeef = ifBeef;
	}

	public void setBreadType(String type) {

		if (type != "Brown rye red roll")
			System.out.println("Bread type can not be changed for Healthy Burger");

		super.setBreadRollType("Brown rye red roll");
	}

	@Override
	public String toString() {
		return "HealthyBurger [isIfGuac()=" + isIfGuac() + ", isIfBeef()=" + isIfBeef() + ", finalPrice()="
				+ finalPrice() + ", getBreadRollType()=" + getBreadRollType() + ", getMeatType()=" + getMeatType()
				+ ", isIfTomato()=" + isIfTomato() + ", isIfLettuce()=" + isIfLettuce() + ", isIfCarrot()="
				+ isIfCarrot() + ", isIfSourCream()=" + isIfSourCream() + ", getBasePrice()=" + getBasePrice() + "]";
	}

	private boolean ifBeef;

	public HealthyBurger(String meatType, boolean ifTomato, boolean ifLettuce, boolean ifCarrot, boolean ifSourCream,
			boolean ifGuac, boolean ifBeef) {

		super("Brown rye red roll", meatType, ifTomato, ifLettuce, ifCarrot, ifSourCream);
		this.ifBeef = ifBeef;
		this.ifGuac = ifGuac;
	}

	public double finalPrice() {

		double priceFromBase = super.finalPrice();

		if (ifGuac)
			priceFromBase += 2;
		if (ifBeef)
			priceFromBase += 3;

		return priceFromBase;
	}

}
