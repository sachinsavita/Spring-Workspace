package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//This class I am using for setter injection 

@Component
public class CricketCoach implements Coach {
	
	
// ### @PostConstruct, @PreDestroy methods learning  ### //
	
	public CricketCoach(FortuneService randomFortuneService) {}

	//This will execute after bean creation
	@PostConstruct
	public void doMyCleanUpStuff()
	{
		System.out.println("Inside CricketCoach's PostConstruct()");
	}
	
	//This will execute before bean destruction
	@PreDestroy
	public void doMyStartUpStuff()
	{
		System.out.println("Inside CricketCoach's PreConstruct()");
	}
	
	
	//For "prototype" scoped beans, Spring does not call the @PreDestroy method.
	
	
// ### @PostConstruct, @PreDestroy methods learning	### //
	
	
	@Autowired //If we use this annotation over here we don't need to do constructor or setter injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	//here i am implementing setter injection
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService)
//	{
//		fortuneService = theFortuneService;
//	}
	
	
	//Here I am implementing method injection
	
	
//	@Autowired
//	public void giveMyFortune(FortuneService theFortuneService)
//	{
//		fortuneService = theFortuneService;
//	}
	
	
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice leg bowling spin till afternoon";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
