package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class HockyCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	
// ### @PostConstruct, @PreDestroy methods learning  ### //
	
	
		public HockyCoach(FortuneService theFortuneService) {}

		//This will execute after bean creation
		@PostConstruct
		public void doMyCleanUpStuff()
		{
			System.out.println("Inside HockyCoach's PostConstruct()");
		}
		
		//This will execute before bean destruction
		@PreDestroy
		public void doMyStartUpStuff()
		{
			System.out.println("Inside HockyCoach's PreConstruct()");
		}
		
		
//For "prototype" scoped beans, Spring does not call the @PreDestroy method.
		
		
// ### @PostConstruct, @PreDestroy methods learning	### //

	@Override
	public String getDailyWorkout() {
		
		return "Work on your flick shot today and I want it to be perfect till evening!";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
