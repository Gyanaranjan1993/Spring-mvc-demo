package com.gyana.concurrency.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {

		ExecutorService e1 = Executors.newSingleThreadExecutor();

		e1.submit(() -> {
			String t1 = Thread.currentThread().getName();
			System.out.println("Hello" + t1);
		});
		e1.execute(() -> {
			System.out.println(Thread.currentThread().getName());
		});

		e1.shutdown();

		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
	}

}
