package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HockyConfig {
	
	@Bean
	public FortuneService randomFotuneService()
	{
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach hockyCoach()
	{
		return new HockyCoach(randomFotuneService());
	}

}
