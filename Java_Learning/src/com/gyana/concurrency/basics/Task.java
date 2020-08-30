package com.gyana.concurrency.basics;

public class Task implements Runnable {

	private String command;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Task(String command) {
		this.command = command;
	}

	@Override
	public void run() {
		System.out.println("I am running" + Thread.currentThread().getName() + "Start . Command -> " + command);
		processCommand();
		System.out.println("Thread ->" + Thread.currentThread().getName() + " ends--");

	}

	private void processCommand() {
		// TODO Auto-generated method stub

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
