package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



//This class is added to scan components using @ComponentScan means whatever beans available it will track no xml file required

@Configuration
@ComponentScan("com.spring.annotations")   //This can be ignored if we are defining each bean using @Bean annotation

//Now no need to mention  <context:component-scan base-package="com.spring.annotations"></context:component-scan> in applicationContext.xml file
public class SportConfig {
	
	
	//******************************************************************//
	
	//NOTE::::::::  Avoid defining bean manually using @Bean annotation
	//Best practice is to use @ComponentScan("package name") and use @Component on each bean class 
	
	//******************************************************************//
	
	
	
	//define bean for our sad fortune service
	@Bean                 //This method name will be the bean ID
	public FortuneService randomFortuneService()
	{
		return new RandomFortuneService();
	}
	
	@Bean                 //This method name will be the bean ID
	public FortuneService saddomFortuneService()
	{
		return new SadFortuneService();
	}

	
   @Bean
   public Coach swimmingCoach()
   {
	   return new SwimmingCoach(randomFortuneService());
   }
   
   @Bean
   public Coach hockyCoach()
   {
	   return new HockyCoach(saddomFortuneService());
   }
   
   @Bean
   public Coach tennisCoach()
   {
	   return new TennisCoach(randomFortuneService());
   }
   
   @Bean
   public Coach cricketCoach()
   {
	   return new CricketCoach(randomFortuneService());
   }
   
   
   
}
