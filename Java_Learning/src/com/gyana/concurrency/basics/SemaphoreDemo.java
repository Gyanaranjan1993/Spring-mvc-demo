package com.gyana.concurrency.basics;

import java.util.concurrent.Semaphore;

/*
 * Semaphore is used to acquire lock in a shared resource while multiple threads are trying to access it.
 * Semaphore provides a constructor where we can mention the maximum number of threads that can access it simultaneously.
 */

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException {

		// number of permits = 1
		Semaphore sem = new Semaphore(1);

		SemaphorWorker s1 = new SemaphorWorker(sem, "A");
		SemaphorWorker s2 = new SemaphorWorker(sem, "B");

		s1.start();
		s2.start();

		// s1.join();
		s2.join();

		System.out.println("count: " + Shared.count);

	}

}
