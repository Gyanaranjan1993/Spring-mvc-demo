package com.gyana.concurrency.basics;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

/*
 * CountDownLatch is used to make sure a specific thread awaits until the others complete before it starts.
 */
public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CountDownLatch latch = new CountDownLatch(4);

		System.out.println("Time now is " + new Date());
		new CountDownLatchWorker(2000, latch).start();
		new CountDownLatchWorker(3000, latch).start();
		new CountDownLatchWorker(4000, latch).start();
		new CountDownLatchWorker(5000, latch).start();

		// Main thread will wait all the other threads are complete
		latch.await();

		System.out.println("Main Thread completes now " + new Date());

	}

}
