package com.abhishek.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	// Field Injection
	@Autowired
	@Qualifier("randomFortuneTeller")
	private Fortune fortune;
	
	/*
	// Setter Injection
	@Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}
	*/
	
	/*
	// Constructor Injection
	@Autowired
	public TennisCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	*/
	public TennisCoach() {
		System.out.println("TennisCoach: Inside default Constructor");
	}

	@Override
	public String doWorkout() {
		return "Do 45 mins of backhand volley practice..";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

	@PostConstruct
	public void doSomeStartupStuff() {
		System.out.println("TennisCoach: Inside doSomeStartupStuff");
	}
	
	@PreDestroy
	public void doSomeCleanupStuff() {
		System.out.println("TennisCoach: Inside doSomeCleanupStuff");
	}
}
