package com.abhishek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private Fortune fortune;
	
	@Autowired
	public TennisCoach(Fortune fortune) {
		this.fortune = fortune;
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

}
