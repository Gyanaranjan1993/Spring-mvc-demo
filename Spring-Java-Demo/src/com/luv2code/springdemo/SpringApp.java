package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Coach coach = (Coach) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("coach");
        System.out.println(coach.getWorkout());
        System.out.println(coach.returnFortune());
        
        BaseballCoach coach1 = (BaseballCoach) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("coach2");
        System.out.println(coach1.getWorkout());
        System.out.println(coach1.returnFortune());
        System.out.println(coach1.getEmail());
       
	}

}
