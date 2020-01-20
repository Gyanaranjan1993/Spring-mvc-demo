package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneservice;
	
	public CricketCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}
	
	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Lets play cricket for 30 minutes everyday";
	}
	
	public String returnFortune() {
		return fortuneservice.getFortune();
	}

}
