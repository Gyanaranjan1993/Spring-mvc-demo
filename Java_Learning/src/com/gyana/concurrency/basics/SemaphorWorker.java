package com.gyana.concurrency.basics;

import java.util.concurrent.Semaphore;

class Shared {

	public static int count = 0;
}

public class SemaphorWorker extends Thread {

	Semaphore sem;
	String threadName;

	public SemaphorWorker(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (this.getThreadName().equals("A")) {

			try {
				System.out.println("Stating Thread Name ->" + this.getThreadName());

				// acquring the lock
				sem.acquire();

				System.out.println(this.getThreadName() + " gets a permit.");

				for (int i = 0; i < 10; i++) {

					Shared.count++;
					System.out.println(this.getThreadName() + ": " + Shared.count);

					Thread.sleep(10);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// releases permit
			System.out.println(this.getThreadName() + " releases permit.");
			sem.release();

		} else {

			try {
				System.out.println("Stating Thread Name ->" + this.getThreadName());

				// acquring the lock
				sem.acquire();

				System.out.println(this.getThreadName() + " gets a permit.");

				for (int i = 0; i < 10; i++) {

					Shared.count++;
					System.out.println(this.getThreadName() + ": " + Shared.count);

					Thread.sleep(10);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
