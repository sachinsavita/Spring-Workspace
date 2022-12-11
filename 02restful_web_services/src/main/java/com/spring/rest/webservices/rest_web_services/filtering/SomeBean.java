package com.spring.rest.webservices.rest_web_services.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




//@JsonIgnoreProperties, @JsonIgnore we are using to restrict specific data like password to be leak

@JsonIgnoreProperties({"field1","field2"})   //together also you can ignore
public class SomeBean {
	
	private String field1;
	@JsonIgnore
	private String field2;
	
	private String field3;
	
	
	
	public SomeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	public String getField1() {
		return field1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	
	
	

}
