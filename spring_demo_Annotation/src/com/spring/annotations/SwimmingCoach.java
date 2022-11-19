package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Straight swim for 30 min!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
