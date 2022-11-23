package com.spring.annotations;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavConfigDemoApp {

	public static void main(String[] args) {

		//read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class	);
// ### For Constructor Injection purpose ###  // 
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		SwimmingCoach swimCoach = context.getBean("swimmingCoach", SwimmingCoach.class);
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		System.out.println("##########   Testing Properties file values via properties file injection    ##########");
		
		System.out.println(swimCoach.getMyName());
		System.out.println(swimCoach.getMyEmail());
		System.out.println(swimCoach.getMyAddress());
		
// ### For Constructor Injection purpose ###  // 
		
// ### For Setter Injection purpose  ### //
		//get the bean from spring container
		System.out.println("################ Setter Injection ##############");
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		//call a method on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		
		
		System.out.println("################ Hocky Coach Instructions ##############");
		Coach hockyCoach = context.getBean("hockyCoach", Coach.class);
		//call a method on the bean
		System.out.println(hockyCoach.getDailyWorkout());
		System.out.println(hockyCoach.getDailyFortune());
		//close the context
		context.close();
// ### For Setter Injection purpose  ### //
	}

}
