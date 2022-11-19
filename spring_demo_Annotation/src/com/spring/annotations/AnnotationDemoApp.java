package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
// ### For Constructor Injection purpose ###  // 
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach swimCoach = context.getBean("swimmingCoach", Coach.class);
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
// ### For Constructor Injection purpose ###  // 
		
// ### For Setter Injection purpose  ### //
		//get the bean from spring container
		System.out.println("################ Setter Injection ##############");
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		//call a method on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
