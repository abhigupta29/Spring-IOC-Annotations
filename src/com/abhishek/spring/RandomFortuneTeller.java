package com.abhishek.spring;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneTeller implements Fortune {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your unlucky day..";
	}

}
