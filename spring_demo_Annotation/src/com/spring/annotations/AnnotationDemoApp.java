package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		//close the context
		context.close();

	}

}
