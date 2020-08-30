package com.gyana.concurrency.basics;

import java.util.concurrent.CyclicBarrier;

/*
 * This is used when Number of threads want to wait for each other at a common point
 */
public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier barrier = new CyclicBarrier(4);

		new CyclicBarrierWorker(1000, barrier, "Party-1").start();
		new CyclicBarrierWorker(1000, barrier, "Party-2").start();
		new CyclicBarrierWorker(1000, barrier, "Party-3").start();
		new CyclicBarrierWorker(1000, barrier, "Party-4").start();

		System.out.println(Thread.currentThread().getName() + " has finished");

	}

}
