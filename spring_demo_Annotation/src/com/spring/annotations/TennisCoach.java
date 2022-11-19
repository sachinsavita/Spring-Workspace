package com.spring.annotations;

import org.springframework.stereotype.Component;

@Component         //here if you will not define like @Component("sillyCoach") then it will automatically take class name start with lower case
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
	
		return "Practice your backhand volly";
	}

}
