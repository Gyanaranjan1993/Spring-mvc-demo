package com.timbuchalka.training;

import java.util.Scanner;

public class MobilePhoneDemo {

	private static Scanner scanner = new Scanner(System.in);
	private MobilePhone mobilePhone = new MobilePhone(123);

	private void removeContact() {

		System.out.println("Please enter existing contact name:\n");
		String name = scanner.nextLine();
		Contact oldContact = mobilePhone.queryContact(name);

		if (oldContact == null) {
			System.out.println("Contact not found");
		} else {
			if (mobilePhone.removeContact(oldContact))
				System.out.println("Contact successfully deleted");
			else
				System.out.println("Error deleting the record");
		}

	}

	private void updateContact() {

		System.out.println("Please enter existing contact name:");
		String name = scanner.nextLine();

		Contact oldContact = mobilePhone.queryContact(name);

		if (oldContact == null) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Contact found");
			System.out.println(oldContact.getName() + "->" + oldContact.getNumber());

			System.out.println("Please enter the new Contact name\n");
			String newName = scanner.nextLine();

			System.out.println("Please enter the new Contact number\n");
			long newNumber = scanner.nextLong();

			Contact newContact = Contact.createContact(newName, newNumber);

			mobilePhone.updateContact(oldContact, newContact);

		}

	}

	private void queryContact() {

		System.out.println("Please enter a contact name to search:\n");
		String name = scanner.nextLine();
		Contact contact = mobilePhone.queryContact(name);

		if (contact == null) {
			System.out.println("Contact not found");
		} else {
			System.out.println("Contact found");
			System.out.println(contact.getName() + "->" + contact.getNumber());
		}

	}

	private void addNewContact() {

		System.out.println("Enter a contact name:");
		String name = scanner.nextLine();

		System.out.println("Enter contact number:");
		long number = scanner.nextLong();

		Contact newContact = Contact.createContact(name, number);
		if (mobilePhone.addContact(newContact)) {
			System.out.println("New Contact added->" + newContact.getName() + "->" + newContact.getNumber());
		} else {
			System.out.println("Could not add the contact");
		}
	}

	private void startPhone() {
		System.out.println("Starting the phone");
	}

	private void printActions() {
		System.out.println("\nAvailable actions: \npress");
		System.out.println("0 - to shutdown phone\n" + "1 - to print Contacts\n" + "2 - to add a new contact\n"
				+ "3 - to update a contact\n" + "4 - to remove a contact\n" + "5 - to search for a contact\n"
				+ "6 - to print the available actions");
		System.out.println("Choose your action: ");
	}

	public static void main(String[] args) {

		MobilePhoneDemo mobilePhoneDemo = new MobilePhoneDemo();
		boolean quit = false;
		mobilePhoneDemo.startPhone();
		mobilePhoneDemo.printActions();

		while (!quit) {
			System.out.println("Enter Action :\n");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {

			case 0:
				System.out.println("Shutting down phone\n");
				quit = true;
				break;
			case 1:
				mobilePhoneDemo.mobilePhone.printContacts();
				break;
			case 2:
				mobilePhoneDemo.addNewContact();
				break;
			case 3:
				mobilePhoneDemo.updateContact();
				break;
			case 4:
				mobilePhoneDemo.removeContact();
				break;
			case 5:
				mobilePhoneDemo.queryContact();
				break;
			case 6:
				mobilePhoneDemo.printActions();
				break;
			default:
				System.out.println("Please enter a valid option");
				break;
			}
		}
	}

}
