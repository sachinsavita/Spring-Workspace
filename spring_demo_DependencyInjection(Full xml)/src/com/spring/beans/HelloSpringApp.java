package com.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from the spring container
		Coach baseCoach = context.getBean("myBaseBallCoach", Coach.class);
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		//call method on the bean
		System.out.println(baseCoach.getDailyWorkOut());
		System.out.println(baseCoach.getFortune());
		
		//For trackCoach
		System.out.println(trackCoach.getDailyWorkOut());
		System.out.println(trackCoach.getFortune());
		
		//for cricket coach
		System.out.println(cricketCoach.getDailyWorkOut());
		System.out.println(cricketCoach.getFortune());
		//close the context
        context.close();
	}

}
