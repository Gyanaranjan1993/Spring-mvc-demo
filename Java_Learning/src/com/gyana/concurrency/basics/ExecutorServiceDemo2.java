package com.gyana.concurrency.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo2 {

	public static void main(String[] args) {

		ExecutorService e1 = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 10; i++) {

			e1.execute(new Task("" + i));
		}
		e1.shutdown();

		while (!e1.isTerminated()) {

		}

		System.out.println("Finished all Threads");
	}

}
