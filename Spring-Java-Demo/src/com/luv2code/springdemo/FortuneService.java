package com.luv2code.springdemo;

import java.util.Random;

public class FortuneService {
	
	private String[] a = {"You are lucky","You might be lucky tomoro","You are fucking unlucky"};
	Random rand = new Random();
	int num = rand.nextInt(2);
	
	
	public String getFortune() {	
		return a[num];
	}

}
