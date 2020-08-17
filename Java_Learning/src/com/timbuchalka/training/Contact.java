package com.timbuchalka.training;

public class Contact {

	private String name;
	private long number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public Contact(String name, long contactNumber) {

		this.name = name;
		this.number = contactNumber;
	}

	public static Contact createContact(String name, long number) {
		return new Contact(name, number);
	}
}
