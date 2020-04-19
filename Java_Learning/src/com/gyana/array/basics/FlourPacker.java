package com.gyana.array.basics;

public class FlourPacker {

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		int bigToSmallCount = bigCount * 5;
		int sum = bigToSmallCount + smallCount;
		boolean b = false;

		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			b = false;
		} else if (goal == sum) {
			b = true;
		}
		return b;

	}

	public static void main(String[] args) {
		boolean a = canPack(2, 1, 5);
		System.out.println(a);
	}

}
