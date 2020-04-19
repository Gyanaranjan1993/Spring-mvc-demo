package com.java.exception.basics;

@SuppressWarnings("serial")
class NoMoreMeatException extends Exception {

}

@SuppressWarnings("serial")
class NoMorePlansException extends RuntimeException {

}

interface Omnivore {

	void eatmeat(int amount) throws NoMoreMeatException;

	void eatplants(int amount);
}

class Beer implements Omnivore {

	// NoMoreMeatException need to be handled as its a checked exception. So we need
	// to declare the throw syntax in both interface and implementation.
	@Override
	public void eatmeat(int amount) throws NoMoreMeatException {

		if (amount <= 0) {
			throw new NoMoreMeatException();
		} else {
			System.out.println("Beer is now eating meat");
		}
	}

	// NoMorePlansException is not a checked exception as its a Runtime exception.
	// So
	// it need not be handled in method declaration.
	@Override
	public void eatplants(int amount) {

		if (amount <= 0) {
			throw new NoMorePlansException();
		} else
			System.out.println("Beer is eating plant");

	}

}

public class MethodsWithExceptions {

	public static void main(String[] args) {

		Beer beer = new Beer();

		try {
			beer.eatplants(1);
			beer.eatmeat(2);

		} catch (NoMorePlansException e) {
			e.printStackTrace();
			System.out.println("More plants needed to feed");
		} catch (NoMoreMeatException e) {
			e.printStackTrace();
			System.out.println("More meet needed to feed ");
		} finally {
			System.out.println("Finally Execution completed");
		}
	}

}
