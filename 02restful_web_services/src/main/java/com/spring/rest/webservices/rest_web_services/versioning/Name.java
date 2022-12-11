package com.spring.rest.webservices.rest_web_services.versioning;

public class Name {
	
	public String firstName;
	public String lastName;
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
