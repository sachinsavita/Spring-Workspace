package com.spring.beans;

public class GoalfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public GoalfCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	public GoalfCoach() {}

	@Override
	public String getDailyWorkOut() {
		
		return "Practice your putting skills for 2 hours today";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}

}
