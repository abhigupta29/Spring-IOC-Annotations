package com.abhishek.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// Load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Load bean
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// Execute bean methods
		System.out.println(coach.doWorkout());
		
		// Close context
		context.close();
		
	}

}
