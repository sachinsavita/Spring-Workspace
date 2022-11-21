package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HockyCoachJavConfigDemoApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HockyConfig.class);
		
		Coach hockyCoach = context.getBean("hockyCoach", Coach.class);
		
		
		System.out.println(hockyCoach.getDailyWorkout());
		System.out.println(hockyCoach.getDailyFortune());
		
		context.close();
		

	}

}
