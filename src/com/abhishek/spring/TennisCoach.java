package com.abhishek.spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String doWorkout() {
		return "Do 45 mins of backhand volley practice..";
	}

}
