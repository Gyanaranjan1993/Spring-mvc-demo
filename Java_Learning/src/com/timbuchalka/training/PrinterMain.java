package com.timbuchalka.training;

public class PrinterMain {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.setDuplex(true);
		printer.setTonerLevel(50);

		System.out.println("Printer configuration loaded :" + printer.isDuplex() + " " + printer.getTonerLevel());

		int newTonerlevel = printer.addToner(60);

		if (newTonerlevel == -1) {
			System.out.println("invalid toner amount, make sure the total tonerLevel does not sum up more than 100");
		}
	}

}
