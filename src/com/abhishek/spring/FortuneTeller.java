package com.abhishek.spring;

import org.springframework.stereotype.Component;

@Component
public class FortuneTeller implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day..";
	}

}
