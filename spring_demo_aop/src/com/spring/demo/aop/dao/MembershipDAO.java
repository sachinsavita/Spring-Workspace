package com.spring.demo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	
	public boolean addSillyMember()
	{
		System.out.println(getClass()+"Doing stuff: Adding a membership account! ");
		
		return false;
	}
	
	public boolean goToSleep()
	{
		System.out.println(getClass()+" Going to sleep: Tomorrow I'll do it!! ");
		
		return false;
	}

}
