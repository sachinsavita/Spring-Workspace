package com.spring.demo.aop.aspect;

import java.util.Scanner;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoginAspect {
	
	//This is where we add all our related advice for logging
	
	//let's start with an @Before advice
	
	//after providing qualified name it will execute only after mention class method
//	@Before("execution(public void com.spring.demo.aop.dao.AccountDAO.addAccount())")
	
	//here we can make  optional return type, access modifier, and some part of method name
	
	@Before("execution(*void add*())")               //also possible @Before("execution(*void add*())") but not this @Before("execution(* void add*())")
	public void beforeAddAccountAdvice()
	{
		System.out.println("\n=====>>>>>>>  Executing @Before Advice on method addAccount()");
	}
	

}
