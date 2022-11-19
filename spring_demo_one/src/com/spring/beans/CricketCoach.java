package com.spring.beans;


//This Class is Created to learn about setter injection(fortuneService, setFortuneService) and literal injection(emailAdress and team fields and getters and setters)

//Because TrackCoach, BaseBallCoach Class is telling about constructor injection 


public class CricketCoach implements Coach {
	
	
	// ## for literal injection  ## //
	
	private String emailAddress;	
	private String team;
	
	// ## for literal injection  ## //
	
	
	
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("Cricket Coach: Inside setter method of : setFortuneService");
		fortuneService = theFortuneService;
	}

	public CricketCoach() {}
	
	
	//    #####    Getters and setters of the fields for literal injection    #####     //

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("Cricket Coach: Inside setter method of : setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		
		System.out.println("Cricket Coach: Inside setter method of : setTeam");
		this.team = team;
	}

	
//  #####    Getters and setters of the fields for literal injection    #####     //
	
	
	@Override
	public String getDailyWorkOut() {
		
		return "practice fast bowling!";
	}

	@Override
	public String getFortune() {
		
		return "CricketCoach said: "+fortuneService.getFortune();
	}

}
