package com.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from the spring container
		
		//Here we are creating CricketCoach class object, not Coach because
		//The Coach interface has two methods: getDailyWorkout and getDailyFortune
		//The CricketCoach class has four methods: getDailyWorkout, getDailyFortune, getTeam and setTeam
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

		//Call methods on the bean
		// for cricket coach
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getFortune());
		
		//Call our new methods to get our new values
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		
		// close the context
		context.close();

	}

}
