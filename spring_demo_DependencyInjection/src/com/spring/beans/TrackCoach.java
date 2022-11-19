package com.spring.beans;

public class TrackCoach implements Coach{

	
	     //############################     Constructor Injects      ######################################//
       	//define field
		private FortuneService fortuneService;                   
		
		//define constructor
		public TrackCoach(FortuneService theFortuneService)    //Constructor Injection
		{
			fortuneService = theFortuneService;
		}
		
		
		//############################     Constructor Injects      ######################################//

		public TrackCoach() {}   //whenever defining parameterized constructor also define no argument constructor
	
	
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "complete 20 min running workout!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach said: "+fortuneService.getFortune();
	}

}
