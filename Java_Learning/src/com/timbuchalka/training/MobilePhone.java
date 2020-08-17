package com.timbuchalka.training;

import java.util.ArrayList;

public class MobilePhone {

	private long phoneNumber;
	private ArrayList<Contact> a;

	public MobilePhone(long phoneNumber) {

		this.phoneNumber = phoneNumber;
		this.a = new ArrayList<Contact>();
	}

	public boolean addContact(Contact contact) {

		if (findContact(contact.getName()) > 0) {
			System.out.println("Contact is already on file");
			return false;
		} else {
			this.a.add(contact);
			return true;
		}
	}

	// find the contact using the contact object
	private int findContact(Contact contact) {
		return this.a.indexOf(contact);
	}

	// find the contact using the name
	private int findContact(String name) {

		for (int i = 0; i < this.a.size(); i++) {

			Contact contact = this.a.get(i);
			if (contact.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	// update the contact
	public boolean updateContact(Contact oldContact, Contact newContact) {

		int foundPosition = findContact(oldContact);
		this.a.set(foundPosition, newContact);
		System.out.println("Contact has been updated");
		return true;
	}

	// query the contact using contact object
	public String queryContact(Contact contact) {

		if (findContact(contact) >= 0) {
			return contact.getName();
		} else {
			return null;
		}

	}

	public Contact queryContact(String name) {
		if (findContact(name) >= 0) {
			return this.a.get(findContact(name));
		} else {
			return null;
		}
	}

	// remove the contact
	public boolean removeContact(Contact contact) {

		int foundPosition = findContact(contact);
		this.a.remove(foundPosition);
		System.out.println(contact.getName() + " is deleted");
		return true;

	}

	// print the contacts here
	public void printContacts() {

		if (this.a.isEmpty()) {
			System.out.println("Contact list is empty");
		} else {
			System.out.println("Contact list");

			for (int i = 0; i < this.a.size(); i++) {
				System.out.println((i + 1) + "->" + this.a.get(i).getName() + "," + this.a.get(i).getNumber());
			}
		}

	}

}
