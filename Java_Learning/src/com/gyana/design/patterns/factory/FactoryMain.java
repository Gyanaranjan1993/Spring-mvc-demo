package com.gyana.design.patterns.factory;

import java.util.Scanner;

/*
 * Factory Design pattern is used when there are multiple implementation to a single class and 
 * we don't want to expose our process of creating instances of different implementations to
 * client applications. 
 * 
 * 
 * Lets say we have different OS and client asks for OS object as required.
 * 
 * We have created new OS - blackberry and client wants to get blackberry OS.
 * By using factory pattern, we can do changes to our factory.
 * Client application will just make a call with parameters for the blackberry OS instance. 
 * No need in the client application to create instances of blackberry OS
 * 
 * advantages:
 * 
 * We are keeping our implementations hidden from the external world. Client will just call in a generic way.
 * 
 */
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the OS you need");
		String osName = in.nextLine();

		getOS(osName);

	}

	private static void getOS(String osName) {
		// TODO Auto-generated method stub

		OperatingSystemFactory factory = new OperatingSystemFactory();

		OS os = factory.getOS(osName);
		os.spec();

	}

}
