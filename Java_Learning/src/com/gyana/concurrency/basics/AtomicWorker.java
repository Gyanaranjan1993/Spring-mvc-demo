package com.gyana.concurrency.basics;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicWorker implements Runnable {

	private AtomicInteger counter = new AtomicInteger(10);

	public int getValue() {
		return counter.get();
	}

	public void run() {

		while (true) {

			int existingValue = getValue();
			int newValue = existingValue + 1;
			if (counter.compareAndSet(existingValue, newValue)) {
				System.out.println("The value is " + newValue);
				return;
			}
		}

	}
}
