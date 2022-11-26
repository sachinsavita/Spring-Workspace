package com.spring.rest.webservices.rest_web_services.helloWorld;

public class HelloWorldBean {
	
	private String message = "Calling the defined variable!";

	public HelloWorldBean() {}
	public HelloWorldBean(String message)
	{
		System.out.println("Inside HelloWorldBean Controller");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
