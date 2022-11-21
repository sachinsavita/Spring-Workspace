package com.spring.annotations;

import org.springframework.stereotype.Component;
//This class I am using for constructor injection practice 

@Component
public class SwimmingCoach implements Coach {
	
	
	//If we use this annotation over here we don't need to do constructor or setter injection
	
	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	public SwimmingCoach(){	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim for 30 min straight!!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
