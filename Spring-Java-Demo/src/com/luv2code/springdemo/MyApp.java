package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach coach = new BaseballCoach();
		
		System.out.println(coach.getWorkout());
		
		Coach coach1 = new CricketCoach(null);
		
		System.out.println(coach1.getWorkout());

	}

}
