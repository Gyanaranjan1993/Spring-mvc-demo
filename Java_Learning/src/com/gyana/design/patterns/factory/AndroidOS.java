package com.gyana.design.patterns.factory;

public class AndroidOS implements OS {

	@Override
	public void spec() {
		System.out.println("Android OS : runs on Linux kernel");

	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("Android OS : 5 GHZ");

	}

}
