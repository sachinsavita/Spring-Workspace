package com.spring.beans;

public class BaseBallCoach implements Coach{
	
	
	//############################     Constructor Injection      ######################################//
	//define field
	private FortuneService fortuneService;                   
	
	//define constructor injection
	public BaseBallCoach(FortuneService theFortuneService)    //Constructor Injection
	{
		fortuneService = theFortuneService;
	}
	
	
	//############################     Constructor Injection      ######################################//

	public BaseBallCoach() {}   //whenever defining parameterized constructor also define no argument constructor
	
	
	// ### Here we are using init-method and destroy-method  ###//
	//NOte: The method can not accept any arguments. The method should be no-arg.
	public void myInitMethod()
	{
	    System.out.println("Called my myInitMethod()");
	}
	
	public void myDestroyMethod()
	{
		System.out.println("Called my myDestroyMethod()");
	}
	// ### Here we are using init-method and destroy-method  ###//
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "spend 30 min on batting practice!";
	}


	@Override
	public String getFortune() {
		// Use fortuneService to get a fortune
		return "BaseBallCoach said: "+fortuneService.getFortune();
	}

}
