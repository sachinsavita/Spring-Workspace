package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	//load employee data
	
	private List<Employee> empList;
	
	@PostConstruct
	private void loadData()
	{
		//create employee
		Employee emp1 = new Employee(1,"sachin","savita","sachin@gmail.com");
		Employee emp2 = new Employee(2,"aswin","sundar","aswin@gmail.com");
		Employee emp3 = new Employee(3,"bharat","singh","bharat@gmail.com");
		//create the list
		empList = new ArrayList<>();
		
		//add to the list
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
	}
	
	
	//addmapping for "/list"
	@GetMapping("/listEmployees")
	public String listEmployees(Model model)
	{
		model.addAttribute("employees", empList);
		return "list-employees";
	}

}
