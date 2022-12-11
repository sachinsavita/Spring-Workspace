package com.spring.rest.webservices.rest_web_services.user;

import java.time.LocalDate;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	private Integer id;
	@Size(min = 2, message = "Name should have atleast 2 characters")
	@JsonProperty("Full_Name")
	private String 	name;
	@Past(message = "Birth date can not be in future")
	@JsonProperty("Date_Of_Birth")
	private LocalDate dob;
	
	
	public User(Integer id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	

}
