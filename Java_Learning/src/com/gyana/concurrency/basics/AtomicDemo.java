package com.gyana.concurrency.basics;

public class AtomicDemo {

	public static void main(String[] args) {

		new Thread(new AtomicWorker()).start();
		new Thread(new AtomicWorker()).start();
		new Thread(new AtomicWorker()).start();

		// System.out.println("The value of counter is" + new
		// AtomicWorker().getValue());
	}
}
