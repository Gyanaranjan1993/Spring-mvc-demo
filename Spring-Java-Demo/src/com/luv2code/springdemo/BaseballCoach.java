package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneservice;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkout() {
		 return "Play baseball for 30 minutes";
	
	}

	@Override
	public String returnFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}
	
	public void atFirst() {
	       System.out.println("Database connection is done here");
	}
	
	public void atEnd() {
	       System.out.println("Database connection is closed here");
	}


}
