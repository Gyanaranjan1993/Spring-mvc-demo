package com.timbuchalka.training;

public class Hamburger {

	private String breadRollType;
	private String meatType;
	private boolean ifTomato = false;
	private boolean ifLettuce = false;
	private boolean ifCarrot = false;
	private boolean ifSourCream = false;
	private int basePrice = 3;

	public String getBreadRollType() {
		return breadRollType;
	}

	public void setBreadRollType(String breadRollType) {
		this.breadRollType = breadRollType;
	}

	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	public boolean isIfTomato() {
		return ifTomato;
	}

	public void setIfTomato(boolean ifTomato) {
		this.ifTomato = ifTomato;
	}

	public boolean isIfLettuce() {
		return ifLettuce;
	}

	public void setIfLettuce(boolean ifLettuce) {
		this.ifLettuce = ifLettuce;
	}

	public boolean isIfCarrot() {
		return ifCarrot;
	}

	public void setIfCarrot(boolean ifCarrot) {
		this.ifCarrot = ifCarrot;
	}

	public boolean isIfSourCream() {
		return ifSourCream;
	}

	public void setIfSourCream(boolean ifSourCream) {
		this.ifSourCream = ifSourCream;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public double finalPrice() {

		double finalPrice = basePrice;
		if (ifTomato)
			finalPrice += 0.5;
		if (ifLettuce)
			finalPrice += 0.5;
		if (ifSourCream)
			finalPrice += 1;
		if (ifCarrot)
			finalPrice += 1;

		return finalPrice;
	}

	public Hamburger() {
	}

	public Hamburger(String breadRollType, String meatType, boolean ifTomato, boolean ifLettuce, boolean ifCarrot,
			boolean ifSourCream) {
		this.breadRollType = breadRollType;
		this.meatType = meatType;
		this.ifTomato = ifTomato;
		this.ifLettuce = ifLettuce;
		this.ifCarrot = ifCarrot;
		this.ifSourCream = ifSourCream;
	}

}
