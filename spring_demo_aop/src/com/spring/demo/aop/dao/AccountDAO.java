package com.spring.demo.aop.dao;

import org.springframework.stereotype.Component;

import com.spring.demo.aop.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipFalg)
	{
		System.out.println(getClass()+": Doing my DB work: ADD Account");  //getClass give us the class name o display 
	} 
	
	public String doWork()
	{
		return "Doing my work";
	} 

}
