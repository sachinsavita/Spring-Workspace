package com.spring.rest.webservices.rest_web_services.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	//Here we are defining the structure of exception or error message
	
	
	//timestamp (when the error happen)
	private LocalDateTime timestamp;
	//message
	private String message;
	//details
    private String details; 
    
    
	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}
	
    
    
    
    
}
