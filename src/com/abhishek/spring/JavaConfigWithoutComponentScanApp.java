package com.abhishek.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigWithoutComponentScanApp {

	public static void main(String[] args) {
		// Load configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Load bean
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// Execute bean methods
		System.out.println(coach.doWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println("Email: "+coach.getEmail());
		System.out.println("Team: "+coach.getTeam());
		
		// Close context
		context.close();
		
	}

}
