package com.gyana.concurrency.basics;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierWorker extends Thread {

	private int duration;
	private CyclicBarrier barrier;

	public CyclicBarrierWorker(int duration, CyclicBarrier barrier, String name) {

		super(name);
		this.duration = duration;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() + " is calling");
			barrier.await();
			System.out.println(Thread.currentThread().getName() + " is running");

		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
