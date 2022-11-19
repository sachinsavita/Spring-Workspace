package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//This class I am using for setter injection 

@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//here i am implementing setter injection
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService)
//	{
//		fortuneService = theFortuneService;
//	}
	
	
	//Here I am implementing method injection
	@Autowired
	public void giveMyFortune(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice leg bowling spin till afternoon";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
