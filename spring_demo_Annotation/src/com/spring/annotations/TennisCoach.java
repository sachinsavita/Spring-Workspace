package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component         //here if you will not define like @Component("sillyCoach") then it will automatically take class name start with lower case
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	// #### Adding dependency using @Autowired annotation
	
	@Autowired   //Also working if don't use this here  
	//because: As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary 
	//if the target bean only defines one constructor to begin with. However, if several constructors are available, 
	//at least one must be annotated to teach the container which one to use.
	
	//prefer to use the @Autowired annotation because it makes the code more readable.
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	//Notes: 
	//What if there are multiple FortuneService implementations?
	//Spring has special support to handle this case. Use the @Qualifier annotation.
	
	
	// #### Adding dependency using @Autowired annotation
	

	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volly";
	}
	
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

}