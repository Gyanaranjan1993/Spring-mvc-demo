package com.timbuchalka.training;

public class Printer {

	private int tonerLevel;
	private int numberOfPages = 0;
	private boolean isDuplex;

	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		if (tonerLevel > 0 && tonerLevel <= 100)
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public boolean isDuplex() {
		return isDuplex;
	}

	public void setDuplex(boolean isDuplex) {
		this.isDuplex = isDuplex;
	}

	public int addToner(int tonerAmount) {

		if (tonerAmount > -1 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100)
				return -1;
			else {
				this.tonerLevel += tonerAmount;
				return this.tonerLevel;
			}

		} else {
			return -1;
		}
	}

	public int printPages(int pages) {

		int pagesToPrint = pages;
		if (isDuplex) {
			pagesToPrint /= 2;
			System.out.println("Printing in duplex mode");

		}

		this.numberOfPages = pagesToPrint;
		return this.numberOfPages;
	}
}
