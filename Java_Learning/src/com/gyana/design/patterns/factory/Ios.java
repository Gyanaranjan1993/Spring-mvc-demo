package com.gyana.design.patterns.factory;

public class Ios implements OS {

	@Override
	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("IOS : Runs on bash shell");

	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		System.out.println("IOS : Power is 6ghz");
	}

}
