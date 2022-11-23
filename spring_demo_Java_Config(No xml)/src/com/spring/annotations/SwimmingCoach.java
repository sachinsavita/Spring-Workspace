package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//This class I am using for constructor injection practice 

@Component
public class SwimmingCoach implements Coach {
	
	
	//If we use this annotation over here we don't need to do constructor or setter injection
	
	private FortuneService fortuneService;
	
	@Value("${myName}")
	private String myName;
	
	@Value("${myEmail}")
	private String myEmail;
	
	@Value("${myAddress}")
	private String myAddress;
	
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

	public String getMyName() {
		return myName;
	}

	public String getMyEmail() {
		return myEmail;
	}

	public String getMyAddress() {
		return myAddress;
	}
	
	

}
