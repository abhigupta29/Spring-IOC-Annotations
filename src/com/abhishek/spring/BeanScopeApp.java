package com.abhishek.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean equalObjects = (theCoach == alphaCoach);
		
		System.out.println("Pointing to same object: "+equalObjects);
		
		System.out.println("Memory location of theCoach: "+theCoach);
		System.out.println("Memory location of alphaCoach: "+alphaCoach);
		
		context.close();
	}

}
