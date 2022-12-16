package com.spring.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.aop.dao.AccountDAO;
import com.spring.demo.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO theAccountDao = context.getBean("accountDAO",AccountDAO.class);
		//get membership bean from spring container
		MembershipDAO theMembershipDao = context.getBean("membershipDAO",MembershipDAO.class);
		//call the business method
		
		Account myAccount = new Account();
		theAccountDao.addAccount(myAccount, true);
		
		System.out.println(theAccountDao.doWork());
		System.out.println();
		System.out.println("Lets call memebership account!!");  
		theMembershipDao.addSillyMember();
		System.out.println(theMembershipDao.goToSleep());
		
		//class the context
        context.close();
	}

}
