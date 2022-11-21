package com.spring.annotations;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// ### @PostConstruct, @PreDestroy methods learning ### //

	// This will execute after bean creation
	@PostConstruct
	public void doMyCleanUpStuff() {
		System.out.println("Inside RandomFortuneService's PostConstruct()");
	}

	// This will execute before bean destruction
	@PreDestroy
	public void doMyStartUpStuff() {
		System.out.println("Inside RandomFortuneService's PreConstruct()");
	}

	// For "prototype" scoped beans, Spring does not call the @PreDestroy method.

	// ### @PostConstruct, @PreDestroy methods learning ### //
	
	
	
	
	
	

	// create an array of strings
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	@Bean
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);

		String theFortune = data[index];

		return theFortune;
	}

}
