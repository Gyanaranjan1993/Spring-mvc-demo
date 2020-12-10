package com.gyana.concurrency.basics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mycallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(4);

		List<Future<String>> list = new ArrayList<>();

		Callable<String> callable = new Mycallable();

		for (int i = 0; i < 100; i++) {

			Future<String> f = executor.submit(callable);
			list.add(f);

		}

		for (Future<String> fut : list) {

			try {
				System.out.println(new Date() + "::" + fut.get());

			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}

		}

	}

}
