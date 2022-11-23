package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "welcome";
	}
	
	
	//new controller method to read for data 
	//and add data to the model
	
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		
		//read the request parameter from the html form
		String myName = request.getParameter("myname");
		
		//convert the data to all caps
		String theName = myName.toUpperCase();
		//create the message
		String result = "Name="+theName;
		//add message to the model
		model.addAttribute("message",result);   //name value 
		
		return "welcome";
	}
	
	
	//In this method we are using @RequestParam to avoid HttpServletRequest 
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("fname") String fName,@RequestParam("lname") String lName, Model model)
	{
		
		//read the request parameter from the html form
		//String myName = request.getParameter("myname");
		
		//convert the data to all caps
		String fName1 = fName.toUpperCase();
		String lName1 = lName.toUpperCase();
		//create the message
		String result = "Hey my friend from v3 "+fName1+" "+lName1;
		//add message to the model
		model.addAttribute("message",result);   //name value 
		
		return "welcome";
	}
	
	
	
	
	
	
	
}
