package com.gyana.concurrency.basics;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchWorker extends Thread {

	private int delay;
	private CountDownLatch latch;

	public CountDownLatchWorker(int delay, CountDownLatch latch) {
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " Finished");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
