package com.gyana.concurrency.basics;

public class VolatileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VolatileWorker v1 = new VolatileWorker("A");
		VolatileWorker v2 = new VolatileWorker("B");
		VolatileWorker v3 = new VolatileWorker("C");
		VolatileWorker v4 = new VolatileWorker("D");
		VolatileWorker v5 = new VolatileWorker("E");

		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v5.start();

	}

}
