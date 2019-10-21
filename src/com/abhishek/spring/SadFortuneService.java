package com.abhishek.spring;

public class SadFortuneService implements Fortune {

	@Override
	public String getDailyFortune() {
		return "Today is your sad day..";
	}

}
