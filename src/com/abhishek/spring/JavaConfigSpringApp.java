package com.abhishek.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigSpringApp {

	public static void main(String[] args) {
		// Load configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Load bean
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		// Execute bean methods
		System.out.println(coach.doWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		// Close context
		context.close();
		
	}

}
