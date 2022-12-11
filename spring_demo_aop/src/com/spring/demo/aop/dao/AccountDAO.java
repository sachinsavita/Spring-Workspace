package com.spring.demo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount()
	{
		System.out.println(getClass()+": Doing my DB work: ADD Account");  //getClass give us the class name o display 
	} 

}
