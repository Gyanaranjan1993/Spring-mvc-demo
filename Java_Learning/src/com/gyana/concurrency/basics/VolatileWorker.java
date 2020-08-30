package com.gyana.concurrency.basics;

class SharedVolatile {
	public static volatile int sharedCount = 0;
}

public class VolatileWorker extends Thread {

	private String name;

	public VolatileWorker(String name) {
		super(name);
		this.name = name;
	}

	public void run() {

		try {

			System.out.println("Starting Thread ->" + this.name);
			Thread.sleep(2000);

			for (int i = 0; i < 10; i++) {
				SharedVolatile.sharedCount++;
			}

			System.out.println("Finishing Thread ->" + this.name + " and sharedcount is" + SharedVolatile.sharedCount);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
